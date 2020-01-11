package com.stock.history.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.stock.history.command.HistoryForm;
import com.stock.history.domain.History;

@Component
public class HistoryToHistoryForm implements Converter<History, HistoryForm> {
    @Override
    public HistoryForm convert(History history) {
    	
    	HistoryForm historyForm = new HistoryForm();
    	historyForm.setId(history.getId().toHexString());
    	historyForm.setAction(null);
    	historyForm.setEmail(history.getEmail());
    	historyForm.setTimeOfAction(history.getTimeOfAction());
    	historyForm.setTitle(history.getTitle());
    	
    	return historyForm;
    }
}
