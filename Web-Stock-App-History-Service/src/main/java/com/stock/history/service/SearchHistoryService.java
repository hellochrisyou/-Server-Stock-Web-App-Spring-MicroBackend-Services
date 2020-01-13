package com.stock.history.service;

import com.stock.history.domain.SearchHistory;

public interface SearchHistoryService {

	public SearchHistory addSearchHistory(final SearchHistory searchHistory);

	public void removeSearchHistory(final String id);

	public SearchHistory updateSearchHistory(final SearchHistory searchHistory);
}
