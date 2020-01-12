package com.stock.history.graphQL;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.history.domain.ActivityHistory;
import com.stock.history.domain.BaseHistory;
import com.stock.history.domain.SearchHistory;
import com.stock.history.repository.ActivityHistoryRepository;
import com.stock.history.repository.SearchHistoryRepository;
import com.stock.history.service.ActivityHistoryService;
import com.stock.history.service.SearchHistoryService;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	@Autowired
	ActivityHistoryService activityHistoryService;
	@Autowired
	SearchHistoryService searchHistoryService;
	@Autowired
	SearchHistoryRepository searchHistoryRepository;
	@Autowired
	ActivityHistoryRepository activityHistoryRepository;

//	Activity History
	public DataFetcher<List<ActivityHistory>> getAllActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> vars = dataFetchingEnvironment.getArguments();
			return activityHistoryRepository.findByEmail(vars.get("email").toString());			
		};
	}
	
	public DataFetcher<BaseHistory> addActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.saveOrUpdate(vars);
			return null;
		};
	}
	
	public DataFetcher<BaseHistory> updateActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.registerAcct();
			return null;
		};
	}
	
	public DataFetcher<BaseHistory> removeActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.removeActivityHistory(id)
			return null;
		};
	}
	
//	Search History
	public DataFetcher<List<SearchHistory>> getAllSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> vars = dataFetchingEnvironment.getArguments();
			return searchHistoryRepository.findByEmail(vars.get("email").toString());			
		};
	}
	
	public DataFetcher<BaseHistory> addSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return searchHistoryService.saveOrUpdate(searchHistory);
			return null;
		};
	}
	
	public DataFetcher<BaseHistory> updateSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return searchHistoryService.saveOrUpdate(searchHistory);
			return null;
		};
	}
	
	public DataFetcher<BaseHistory> removeSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return searchHistoryService.removeSearchHistory(id);
			return null;
		};
	}
}
