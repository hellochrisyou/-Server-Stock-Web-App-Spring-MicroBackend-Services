package com.stock.history.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.command.HistoryForm;
import com.stock.history.convert.HistoryFormToHistory;
import com.stock.history.domain.History;
import com.stock.history.repository.HistoryRepository;
import com.stock.history.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService{

	private HistoryRepository historyRepository;
    private HistoryFormToHistory historyFormToHistory;

    @Autowired
    public HistoryServiceImpl(HistoryRepository historyRepository, HistoryFormToHistory historyFormToHistory) {
        this.historyRepository = historyRepository;
        this.historyFormToHistory = historyFormToHistory;
    }


    @Override
    public List<History> listAll() {
        List<History> histories = new ArrayList<>();
        historyRepository.findAll().forEach(histories::add); //fun with Java 8
        return histories;
    }

    @Override
    public History getById(String id) {
        return historyRepository.findById(id).orElse(null);
    }

    @Override
    public History getByEmail(String email) {
    	return historyRepository.findByEmail(email);
    }
    
    @Override
    public History saveOrUpdate(History history) {
        historyRepository.save(history);
        return history;
    }

    @Override
    public void delete(String id) {
        historyRepository.deleteById(id);
    }

    @Override
    public History saveOrUpdateProductForm(HistoryForm historyForm) {
    	History savedHistory = saveOrUpdate(historyFormToHistory.convert(historyForm));

        System.out.println("Saved History Id: " + savedHistory.getId());
        return savedHistory;
    }
}