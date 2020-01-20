package com.stock.stock.service;

import java.util.List;
import java.util.Map;

import com.stock.stock.model.Stock;


public interface StockService {

	public List<Stock>findStocks(final String email);
	
	public Stock addStock(final Object stock);
	
	public Stock deleteStock(final Stock stock);
	
	public List<Stock> clearStocks(final Stock stock);
}
