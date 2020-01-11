package com.stock.ipo.service;

import java.util.List;

import com.stock.ipo.command.IpoForm;
import com.stock.ipo.domain.Ipo;

public interface IpoService {

	List<Ipo> listAll();

	Ipo getById(String id);

	Ipo saveOrUpdate(Ipo ipo);

	void delete(String id);

	Ipo saveOrUpdateProductForm(IpoForm ipoForm);
}
