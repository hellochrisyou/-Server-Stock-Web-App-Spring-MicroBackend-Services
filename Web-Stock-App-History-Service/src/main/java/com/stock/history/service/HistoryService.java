package com.stock.history.service;

import java.util.List;

import com.stock.history.command.HistoryForm;
import com.stock.history.domain.History;

public interface HistoryService {

	List<History> listAll();

	History getById(String id);

	History saveOrUpdate(History history);

	void delete(String id);

	History saveOrUpdateProductForm(HistoryForm historyForm);
}
