package com.stock.history.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

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
	public BaseHistory addHistory(BaseHistory history) {
		BaseHistory tmpHistory = new BaseHistory(history);
			historyRepository.save(tmpHistory);
		return tmpHistory;
	}

	@Override
	public List<BaseHistory> clearHistory(BaseHistory history) {
		List<BaseHistory> tmpBaseHistories = this.findAllHistory(history.getEmail());
		List<BaseHistory> baseHistories = new ArrayList<>();
		for (BaseHistory tmpHistory : tmpBaseHistories) {
			if (tmpHistory.getType().equals(history.getType())); {
				baseHistories.add(tmpHistory);
			}
		}
		historyRepository.deleteAll(baseHistories);
		return baseHistories;
	}
}

