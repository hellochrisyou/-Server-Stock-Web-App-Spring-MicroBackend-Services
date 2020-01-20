package com.stock.stock.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stock.stock.model.Stock;
import com.stock.stock.service.StockService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	StockService stockService;
	
	@RequestMapping(value = "/findStocks", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Stock> findStocks(@RequestBody String email) {
		return stockService.findStocks(email);
	}
	
	@RequestMapping(value = "/addStock", method = RequestMethod.POST,
				consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Stock addStock(@RequestBody Stock stock) {
		Stock check = stockService.addStock(stock);
		return check;
	}
		
	@RequestMapping(value = "/clearStock", method = RequestMethod.DELETE,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Stock> deleteStockHistory(@RequestBody Stock stock) {
		return stockService.clearStocks(stock);
	}
}