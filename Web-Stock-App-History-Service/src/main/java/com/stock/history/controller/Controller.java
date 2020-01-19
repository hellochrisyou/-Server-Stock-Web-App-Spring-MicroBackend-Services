package com.stock.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stock.history.model.BaseHistory;
import com.stock.history.service.HistoryService;

@CrossOrigin(maxAge = 3600)
@RestController
public class Controller {

	@Autowired
	HistoryService historyService;
	
	@CrossOrigin
	@RequestMapping(value = "/api/findSearchHistory", method = RequestMethod.GET)
	public List<BaseHistory> findAllHistory(@PathVariable String name) {
		return historyService.findAllHistory(name);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/api/addSearchHistory", method = RequestMethod.POST)
	public BaseHistory addHistory(@RequestBody BaseHistory history) {
		return historyService.addHistory(history);
	}
		
	@CrossOrigin
	@RequestMapping(value = "/ex/deleteSearchHistory", method = RequestMethod.DELETE)
	public BaseHistory deleteHistory(@RequestBody BaseHistory history) {
		return historyService.addHistory(history);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/api/findStockHistory", method = RequestMethod.GET)
	public List<BaseHistory> findStockHistory(@PathVariable String name) {
		return historyService.findAllHistory(name);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/api/addStockHistory", method = RequestMethod.POST)
	public BaseHistory addStockHistory(@RequestBody BaseHistory history) {
		return historyService.addHistory(history);
	}
		
	@CrossOrigin
	@RequestMapping(value = "/ex/deleteStockHistory", method = RequestMethod.DELETE)
	public BaseHistory deleteStockHistory(@RequestBody BaseHistory history) {
		return historyService.addHistory(history);
	}
}