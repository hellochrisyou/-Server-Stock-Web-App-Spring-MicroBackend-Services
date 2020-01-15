package com.stock.history.service;

import java.util.List;
import java.util.Map;

import com.stock.history.domain.BaseHistory;

public interface HistoryService {

	public List<BaseHistory>getAllHistory(final String emailInput); 
	
	public BaseHistory addHistories(final Map<String, Object> historyInput);
	
	public void clearHistory();
}
