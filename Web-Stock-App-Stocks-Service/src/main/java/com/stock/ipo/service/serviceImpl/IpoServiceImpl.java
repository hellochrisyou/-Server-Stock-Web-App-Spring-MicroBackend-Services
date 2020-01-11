package com.stock.ipo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.ipo.command.IpoForm;
import com.stock.ipo.convert.IpoFormToIpo;
import com.stock.ipo.domain.Ipo;
import com.stock.ipo.repository.IpoRepository;
import com.stock.ipo.service.IpoService;

@Service
public class IpoServiceImpl implements IpoService{

	private IpoRepository ipoRepository;
    private IpoFormToIpo ipoFormToIpo;

    @Autowired
    public IpoServiceImpl(IpoRepository ipoRepository, IpoFormToIpo ipoFormToIpo) {
        this.ipoRepository = ipoRepository;
        this.ipoFormToIpo = ipoFormToIpo;
    }


    @Override
    public List<Ipo> listAll() {
        List<Ipo> ipos = new ArrayList<>();
        ipoRepository.findAll().forEach(ipos::add); //fun with Java 8
        return ipos;
    }

    @Override
    public Ipo getById(String id) {
        return ipoRepository.findById(id).orElse(null);
    }

    @Override
    public Ipo saveOrUpdate(Ipo ipo) {
        ipoRepository.save(ipo);
        return ipo;
    }

    @Override
    public void delete(String id) {
        ipoRepository.deleteById(id);
    }

    @Override
    public Ipo saveOrUpdateProductForm(IpoForm ipoForm) {
    	Ipo savedIpo = saveOrUpdate(ipoFormToIpo.convert(ipoForm));

        System.out.println("Saved Ipo Id: " + savedIpo.getId());
        return savedIpo;
    }
}