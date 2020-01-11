package com.stock.ipo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.ipo.command.TagForm;
import com.stock.ipo.convert.TagFormToTag;
import com.stock.ipo.domain.Tag;
import com.stock.ipo.repository.TagRepository;
import com.stock.ipo.service.TagService;

@Service
public class TagServiceImpl implements TagService{

	private TagRepository tagRepository;
    private TagFormToTag tagFormToTag;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository, TagFormToTag tagFormToTag) {
        this.tagRepository = tagRepository;
        this.tagFormToTag = tagFormToTag;
    }


    @Override
    public List<Tag> listAll() {
        List<Tag> tags = new ArrayList<>();
        tagRepository.findAll().forEach(tags::add); //fun with Java 8
        return tags;
    }

    @Override
    public Tag getById(String id) {
        return tagRepository.findById(id).orElse(null);
    }
    
    @Override
    public Tag getByEmail(String email) {
    	return tagRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Tag saveOrUpdate(Tag tag) {
        tagRepository.save(tag);
        return tag;
    }

    @Override
    public void delete(String id) {
        tagRepository.deleteById(id);
    }

    @Override
    public Tag saveOrUpdateProductForm(TagForm tagForm) {
    	Tag savedTag = saveOrUpdate(tagFormToTag.convert(tagForm));

        System.out.println("Saved Tag Id: " + savedTag.getId());
        return savedTag;
    }

}