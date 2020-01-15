package com.stock.history.graphQL;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.history.domain.BaseHistory;
import com.stock.history.repository.HistoryRepository;
import com.stock.history.service.HistoryService;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	@Autowired
	HistoryRepository historyRepository;
	@Autowired
	HistoryService historyService;

	public DataFetcher<List<BaseHistory>> getAllHistory() {
		return null;
	}

	public DataFetcher<BaseHistory> addHistories() {
		return dataFetchingEnvironment -> {
			Map<String, Object> historyInput = dataFetchingEnvironment.getArguments();
			return historyService.addHistories(historyInput);
		};
	}

	public DataFetcher clearHistory() {
		return dataFetchingEnvironment -> {

			return null;
		};
	}
}
