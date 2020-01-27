package com.stock.history.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.model.SearchHistory;
import com.stock.history.repository.SearchRepository;
import com.stock.history.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchRepository historyRepository;
	
	@Override
	public List<SearchHistory> findSearchHistory(final Object email) {
		@SuppressWarnings("rawtypes")
		Map emailMap = (Map) email;
        List<SearchHistory> check = (List<SearchHistory>) historyRepository.findByEmail((String) emailMap.get("jsonString"));
        return check;
	}
	
	@Override
	public SearchHistory addSearchHistory(final SearchHistory history) {
		SearchHistory tmpHistory = new SearchHistory(history);
			historyRepository.save(tmpHistory);
		return tmpHistory;
	}

	@Override
	public void clearSearchHistory(final SearchHistory history) {
		List<SearchHistory> searchHistory = this.findSearchHistory(history.getEmail());
		historyRepository.deleteAll(searchHistory);
		return;
	}
}

