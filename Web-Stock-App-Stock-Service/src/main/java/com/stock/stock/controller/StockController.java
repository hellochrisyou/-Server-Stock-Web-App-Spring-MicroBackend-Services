package com.stock.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.stock.model.Stock;
import com.stock.stock.service.StockService;

//@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	StockService stockService;
	
	@CrossOrigin
	@PostMapping(value = "/findStocks/", consumes = "application/json", produces = "application/json")
	public List<Stock> findStocks(@RequestBody String email) {
		return stockService.findStocks(email);
	}
	
	@CrossOrigin	
	@PostMapping(value = "/addStock/", consumes = "application/json", produces = "application/json")
	public Stock addStock(@RequestBody Object stock) {
		Stock check = stockService.addStock(stock);
		return check;
	}
	
	@CrossOrigin
	@DeleteMapping(value = "/clearStocks/", consumes = "application/json", produces = "application/json")
	public List<Stock> clearStocks(@RequestBody Stock stock) {
		return stockService.clearStocks(stock);
	}
}