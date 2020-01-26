package com.stock.stock.service.serviceImpl;

import java.util.ArrayList;
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
	public List<Stock> findStocks(Object email) {
//		stockRepository.deleteAll();
		@SuppressWarnings("rawtypes")
		Map stockMap = (Map) email;
		List<Stock> check = (List<Stock>) stockRepository.findByEmail((String) stockMap.get("jsonString"));
        return check;
	}

	@Override
	public Stock addStock(Object stockObj) {
		@SuppressWarnings("rawtypes")
		Map stockMap = (Map) stockObj;
		if (stockRepository.findBySymbol((String) stockMap.get("symbol")) == null) {
			Stock tmpStock= new Stock(stockMap);
			tmpStock = stockRepository.save(tmpStock);
			return tmpStock;
		} else {
			return null;
		}
			
	}

	@Override
	public void deleteStock(Object symbolObj) {
		@SuppressWarnings("rawtypes")
		Map symbolMap = (Map) symbolObj;
//		Stock stock = stockRepository.findBySymbol((String) symbolMap.get("jsonString"));
		stockRepository.deleteBySymbol((String) symbolMap.get("jsonString"));
		return;
	}

	@Override
	public List<Stock> clearStocks(Stock stock) {
		List<Stock> tmpStocks= this.findStocks(stock.getEmail());
		List<Stock> stocks = new ArrayList<>();
		stockRepository.deleteAll(tmpStocks);
		return stocks;
	}
}
