package com.stock.history.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.history.model.StockHistory;
import com.stock.history.repository.StockRepository;
import com.stock.history.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;
	
	@Override
	public List<StockHistory> findStockHistory(final String email) {
        List<StockHistory> check = stockRepository.findByEmail(email);
        return check;
	}
	
	@Override
	public StockHistory addStockHistory(final StockHistory history) {
		StockHistory tmpHistory = new StockHistory(history);
		stockRepository.save(tmpHistory);
		return tmpHistory;
	}

	@Override
	public void clearStockHistory(final StockHistory history) {
		List<StockHistory> stockHistories = this.findStockHistory(history.getEmail());
		stockRepository.deleteAll(stockHistories);
		return;
	}
}