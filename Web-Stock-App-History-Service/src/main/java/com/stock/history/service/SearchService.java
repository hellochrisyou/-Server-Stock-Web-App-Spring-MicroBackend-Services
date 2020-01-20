package com.stock.history.service;

import java.util.List;

import com.stock.history.model.SearchHistory;

public interface SearchService {

	public List<SearchHistory>findSearchHistory(final String email);
	
	public SearchHistory addSearchHistory(final SearchHistory history);
	
	public void clearSearchHistory(final SearchHistory history);
}
