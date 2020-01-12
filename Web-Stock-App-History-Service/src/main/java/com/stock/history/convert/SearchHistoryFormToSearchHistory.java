//package com.stock.history.convert;
//
//import org.bson.types.ObjectId;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.util.StringUtils;
//
//import com.stock.history.command.SearchHistoryForm;
//import com.stock.history.domain.SearchHistory;
//
//public class SearchHistoryFormToSearchHistory implements Converter<SearchHistoryForm, SearchHistory> {
//
//    @Override
//    public SearchHistory convert(SearchHistoryForm searchHistoryForm) {
//    	SearchHistory searchHistory = new SearchHistory();
//        if (searchHistoryForm.getId() != null  && !StringUtils.isEmpty(searchHistoryForm.getId())) {
//        	searchHistory.setId(new ObjectId(searchHistoryForm.getId()));
//        }
//        searchHistory.setAction(searchHistoryForm.getAction());
//        searchHistory.setEmail(searchHistoryForm.getEmail());
//        searchHistory.setTimeOfAction(searchHistoryForm.getTimeOfAction());
//        
//        return searchHistory;
//    }
//}