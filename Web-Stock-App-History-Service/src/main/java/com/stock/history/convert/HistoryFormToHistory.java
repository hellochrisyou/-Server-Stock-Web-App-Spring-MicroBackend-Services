package com.stock.history.convert;

import org.bson.types.ObjectId;
import org.springframework.util.StringUtils;
import org.springframework.core.convert.converter.Converter;
import com.stock.history.command.HistoryForm;
import com.stock.history.domain.History;

public class HistoryFormToHistory implements Converter<HistoryForm, History> {

    @Override
    public History convert(HistoryForm historyForm) {
    	History history = new History();
        if (historyForm.getId() != null  && !StringUtils.isEmpty(historyForm.getId())) {
        	history.setId(new ObjectId(historyForm.getId()));
        }
        history.setAction(historyForm.getAction());
        history.setEmail(historyForm.getEmail());
        history.setTimeOfAction(historyForm.getTimeOfAction());
        history.setTitle(historyForm.getTitle());
        
        return history;
    }
}