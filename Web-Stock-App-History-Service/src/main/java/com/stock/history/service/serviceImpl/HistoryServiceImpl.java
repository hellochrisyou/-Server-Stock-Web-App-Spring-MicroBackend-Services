package com.stock.history.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.stock.history.domain.BaseHistory;
import com.stock.history.repository.HistoryRepository;
import com.stock.history.service.HistoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class HistoryServiceImpl implements HistoryService {

	HistoryRepository historyRepository;
	
	@Override
	public List<BaseHistory> getAllHistory(String emailInput) {
		if (historyRepository.existsByEmail(emailInput)) {
			return historyRepository.findByEmail(emailInput);
		}
		return null;
	}
	
	@Override
	public BaseHistory addHistories(final Map<String, Object> historyInput) {
		@SuppressWarnings("unchecked")
		List<BaseHistory> historyArr= (List<BaseHistory>) historyInput.get("historyInput");
		for (BaseHistory tmp : historyArr) {
			BaseHistory tmpHistory = new BaseHistory(tmp);
			historyRepository.save(tmpHistory);
		}
		return null;
	}

	@Override
	public void clearHistory() {		
	}
}
