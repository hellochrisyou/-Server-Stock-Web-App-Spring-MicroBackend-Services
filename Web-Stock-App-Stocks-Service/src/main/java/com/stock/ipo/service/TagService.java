package com.stock.ipo.service;

import java.util.List;

import com.stock.ipo.command.TagForm;
import com.stock.ipo.domain.Tag;


public interface TagService {

	List<Tag> listAll();

	Tag getById(String id);

	Tag getByEmail(String email);
	
	Tag saveOrUpdate(Tag tag);

	void delete(String id);

	Tag saveOrUpdateProductForm(TagForm tagForm);
}
