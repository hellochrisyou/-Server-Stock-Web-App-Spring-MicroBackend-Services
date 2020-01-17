package com.stock.history.service;

import java.util.List;
import java.util.Map;

import com.stock.history.model.BaseHistory;

public interface HistoryService {

	public List<BaseHistory>findAllHistory(final String email);
	
	public BaseHistory addHistory(final List<Map<String, Object>> history);
	
	public List<BaseHistory> clearHistory(final String email, final String type);

}
