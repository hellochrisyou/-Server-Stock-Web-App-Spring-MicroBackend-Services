package com.stock.history.service;

import java.util.List;

import com.stock.history.command.SearchHistoryForm;
import com.stock.history.domain.ActivityHistory;
import com.stock.history.domain.SearchHistory;

public interface SearchHistoryService {

	public SearchHistory addSearchHistory(final SearchHistory searchHistory);

	public SearchHistory updateSearchHistory(final SearchHistory searchHistory);

	public void removeSearchHistory(final String id);
}
