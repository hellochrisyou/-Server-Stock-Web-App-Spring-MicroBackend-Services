package com.stock.history.service;

import java.util.List;

import com.stock.history.model.BaseHistory;

public interface HistoryService {

	public List<BaseHistory>findAllHistory(final String email);
	
	public BaseHistory addHistory(final BaseHistory history);
	
	public List<BaseHistory> clearHistory(final BaseHistory history);
}
