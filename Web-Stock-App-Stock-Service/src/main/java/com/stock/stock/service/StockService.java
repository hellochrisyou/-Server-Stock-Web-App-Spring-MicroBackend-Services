package com.stock.stock.service;

import java.util.List;
import java.util.Map;

import com.stock.stock.model.Stock;


public interface StockService {

	public List<Stock>findStocks(final Object email);
	
	public Stock addStock(final Object stockObj);
	
	public void deleteStock	(final Object symbolObj);
	
//	public List<Stock> clearStocks(final Stock stock);
}
