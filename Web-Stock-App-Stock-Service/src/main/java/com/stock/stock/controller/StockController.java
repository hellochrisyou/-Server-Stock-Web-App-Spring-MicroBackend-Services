package com.stock.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.stock.model.Stock;
import com.stock.stock.service.StockService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	StockService stockService;

	@RequestMapping(value = "/findStocks/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Stock> findStocks(@RequestBody Object email) {
		List<Stock> tmp = stockService.findStocks(email);
		return tmp;
	}

	@RequestMapping(value = "/addStock/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Stock addStock(@RequestBody Object stockObj) {
		Stock check = stockService.addStock(stockObj);
		return check;
	}

	@RequestMapping(value = "/deleteStock/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteStock(@RequestBody Object stockObj) {
		stockService.deleteStock(stockObj);
	}

//	@CrossOrigin
//	@DeleteMapping(value = "/clearStocks/", consumes = "application/json", produces = "application/json")
//	public List<Stock> clearStocks(@RequestBody Stock stockObj) {
//		return stockService.clearStocks(stockObj);
//	}
}