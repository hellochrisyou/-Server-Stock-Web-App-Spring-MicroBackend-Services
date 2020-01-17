package com.stock.history.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.model.BaseHistory;
import com.stock.history.repository.HistoryRepository;
import com.stock.history.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryRepository historyRepository;
	
	@Override
	public List<BaseHistory> findAllHistory(String email) {
        List<BaseHistory> check = (List<BaseHistory>) historyRepository.findByEmail(email);
        return check;
	}
	
	@Override
	public BaseHistory addHistory(final List<Map<String, Object>> history) {				
		BaseHistory tmpHistory = new BaseHistory();
		for(Map<String, Object> e : history) {
	        tmpHistory = new BaseHistory();
			String key = e.get("email").toString();
			tmpHistory.setEmail(key);
			tmpHistory.setTitle("title");
			tmpHistory.setType("type");
//			tmpHistory.setDateRecorded();
			this.historyRepository.save(tmpHistory);
	    }
		return tmpHistory;
	}

	@Override
	public List<BaseHistory> clearHistory(final String email, final String type) {	
		List<BaseHistory> tmpBaseHistories = this.findAllHistory(email);
		List<BaseHistory> baseHistories = new ArrayList<>();
		for (BaseHistory tmpHistory : tmpBaseHistories) {
			if (tmpHistory.getType().equals(type)); {
				baseHistories.add(tmpHistory);
			}
		}
		historyRepository.deleteAll(baseHistories);
		return baseHistories;
	}

	



}

