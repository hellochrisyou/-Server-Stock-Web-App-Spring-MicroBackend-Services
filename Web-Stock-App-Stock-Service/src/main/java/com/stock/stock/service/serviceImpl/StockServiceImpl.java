package com.stock.stock.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.stock.model.Stock;
import com.stock.stock.repository.StockRepository;
import com.stock.stock.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> findStocks(final Object email) {
		@SuppressWarnings("rawtypes")
		Map stockMap = (Map) email;
		List<Stock> check = (List<Stock>) stockRepository.findByEmail((String) stockMap.get("jsonString"));
		return check;
	}

	@Override
	public Stock addStock(final Object stockObj) {
		@SuppressWarnings("rawtypes")
		Map stockMap = (Map) stockObj;
		if (stockRepository.findBySymbol((String) stockMap.get("symbol")) == null) {
			Stock tmpStock = new Stock(stockMap);
			tmpStock = stockRepository.save(tmpStock);
			return tmpStock;
		} else {
			return null;
		}

	}

	@Override
	public void deleteStock(final Object symbolObj) {
		@SuppressWarnings("rawtypes")
		Map symbolMap = (Map) symbolObj;
		stockRepository.deleteBySymbol((String) symbolMap.get("jsonString"));
		return;
	}

//	@Override
//	public List<Stock> clearStocks(Stock stock) {
//		List<Stock> tmpStocks= this.findStocks(stock.getEmail());
//		List<Stock> stocks = new ArrayList<>();
//		stockRepository.deleteAll(tmpStocks);
//		return stocks;
//	}
}
