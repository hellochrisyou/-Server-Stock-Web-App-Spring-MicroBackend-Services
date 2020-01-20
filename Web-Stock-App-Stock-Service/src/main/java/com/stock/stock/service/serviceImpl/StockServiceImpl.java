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
	public List<Stock> findStocks(String email) {
		 List<Stock> check = (List<Stock>) stockRepository.findByEmail(email);
	        return check;
	}

	@Override
	public Stock addStock(Object stock) {
		Stock tmpStock= new Stock(stock);
		stockRepository.save(tmpStock);
	return tmpStock;
	}

	@Override
	public Stock deleteStock(Stock stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> clearStocks(Stock stock) {
		List<Stock> tmpStocks= this.findStocks(stock.getEmail());
		List<Stock> stocks = new ArrayList<>();
		stockRepository.deleteAll(tmpStocks);
		return stocks;
	}
}
