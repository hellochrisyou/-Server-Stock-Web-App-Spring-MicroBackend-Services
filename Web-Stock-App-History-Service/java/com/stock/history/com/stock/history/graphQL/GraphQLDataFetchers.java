package com.stock.history.graphQL;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import domain.ActivityHistory;
import domain.BaseHistory;
import domain.SearchHistory;
import graphql.schema.DataFetcher;
import repository.ActivityHistoryRepository;
import repository.SearchHistoryRepository;
import service.ActivityHistoryService;
import service.SearchHistoryService;

@Component
public class GraphQLDataFetchers {

	@Autowired
	ActivityHistoryRepository activityHistoryRepository;
	@Autowired
	ActivityHistoryService activityHistoryService;
	@Autowired
	SearchHistoryRepository searchHistoryRepository;
	@Autowired
	SearchHistoryService searchHistoryService;

public DataFetcher<BaseHistory> addActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.saveOrUpdate(vars);
			return null;
		};
	}
	
	public DataFetcher<BaseHistory> addSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return searchHistoryService.saveOrUpdate(searchHistory);
			return null;
		};
	}
	
	//	Activity History
	public DataFetcher<List<ActivityHistory>> getAllActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> vars = dataFetchingEnvironment.getArguments();
			return this.activityHistoryRepository.findByEmail(vars.get("email").toString());			
		};
	}
	
	//	Search History
	public DataFetcher<List<SearchHistory>> getAllSearchHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> vars = dataFetchingEnvironment.getArguments();
			return this.searchHistoryRepository.findByEmail(vars.get("email").toString());			
		};
	}
	
public DataFetcher<BaseHistory> removeActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.removeActivityHistory(id)
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
	
	public DataFetcher<BaseHistory> updateActivityHistory() {
		return dataFetchingEnvironment -> {
			Map<String, Object> test = dataFetchingEnvironment.getArguments();
//			return activityHistoryService.registerAcct();
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
}
