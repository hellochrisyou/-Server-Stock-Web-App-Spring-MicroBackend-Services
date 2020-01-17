package com.stock.history.graphQL;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.history.model.BaseHistory;
import com.stock.history.repository.HistoryRepository;
import com.stock.history.service.HistoryService;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetcher {

	@Autowired
	HistoryRepository historyRepository;
	@Autowired
	HistoryService historyService;
	

public DataFetcher<List<BaseHistory>> findAllHistory() {
		return dataFetchingEnvironment -> {
			String email = dataFetchingEnvironment.getArgument("email");
			return historyService.findAllHistory(email);
		};
	}
 	
public DataFetcher<BaseHistory> addHistory() {
	return dataFetchingEnvironment -> {
		List<Map<String, Object>> history= dataFetchingEnvironment.getArgument("history");
		return historyService.addHistory(history);
	};
}

public DataFetcher<List<BaseHistory>> clearHistory() {
	return dataFetchingEnvironment -> {
		String email = dataFetchingEnvironment.getArgument("email");
		String type = dataFetchingEnvironment.getArgument("type");
//		return activityHistoryService.saveOrUpdate(vars);
		return null;
	};
}
}