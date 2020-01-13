package com.stock.history.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.domain.SearchHistory;
import com.stock.history.repository.SearchHistoryRepository;
import com.stock.history.service.SearchHistoryService;

@Service
public class SearchHistoryServiceImpl implements SearchHistoryService{

	@Autowired
	private SearchHistoryRepository searchHistoryRepository;
    
    @Override
    public SearchHistory addSearchHistory(final SearchHistory searchHistory) {
       return searchHistoryRepository.save(searchHistory);
    }

    @Override
    public void removeSearchHistory(final String id) {
        searchHistoryRepository.deleteById(id);
    }
    
}
