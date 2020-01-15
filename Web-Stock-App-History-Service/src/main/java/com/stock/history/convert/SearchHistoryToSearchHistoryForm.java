//package com.stock.history.convert;
//
//import org.springframework.core.convert.converter.Converter;
//
//import com.stock.history.command.SearchHistoryForm;
//import com.stock.history.domain.SearchHistory;
//
//public class SearchHistoryToSearchHistoryForm implements Converter<SearchHistory, SearchHistoryForm> {
//    @Override
//    public SearchHistoryForm convert(SearchHistory searchhistory) {
//    	
//    	SearchHistoryForm searchHistoryForm = new SearchHistoryForm();
//    	searchHistoryForm.setId(searchhistory.getId().toHexString());
//    	searchHistoryForm.setEmail(searchhistory.getEmail());
//    	searchHistoryForm.setTimeOfAction(searchhistory.getTimeOfAction());
//    	searchHistoryForm.setAction(searchhistory.getAction());
//    	
//    	return searchHistoryForm;
//    }
//}
