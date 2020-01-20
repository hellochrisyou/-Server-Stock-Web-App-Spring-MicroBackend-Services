package com.stock.stock.model;

import java.util.Map;

public class Stock {

	private String Select = "Select";
	private String Chart = "Chart";	
	private String email;
	private String Symbol;	
	private String Exchange;
	private String Name;
	private String Open;
	private String Low;
	private String High;
	private String LatestPrice;
	private String Change;
	private String ChangePercent;	
	private String Week52High;
	private String Week52Low;
	private String YtdChange;

	public Stock() {
	}

	public Stock(Stock stock) {
		this.Change = stock.getChange();
		this.ChangePercent = stock.getChangePercent();
		this.email = stock.getEmail(); 
		this.Exchange = stock.getExchange();
		this.High = stock.getHigh();
		this.LatestPrice = stock.getLatestPrice();
		this.Low = stock.getLow();
		this.Name = stock.getName();
		this.Open = stock.getOpen();
		this.Symbol = stock.getSymbol();
		this.Week52High = stock.getWeek52High();
		this.Week52Low = stock.getWeek52Low();
		this.YtdChange = stock.getYtdChange();

	}

	public String getSelect() {
		return Select;
	}

	public void setSelect(String select) {
		Select = select;
	}

	public String getChart() {
		return Chart;
	}

	public void setChart(String chart) {
		Chart = chart;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public String getExchange() {
		return Exchange;
	}

	public void setExchange(String exchange) {
		Exchange = exchange;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getOpen() {
		return Open;
	}

	public void setOpen(String open) {
		Open = open;
	}

	public String getLow() {
		return Low;
	}

	public void setLow(String low) {
		Low = low;
	}

	public String getHigh() {
		return High;
	}

	public void setHigh(String high) {
		High = high;
	}

	public String getLatestPrice() {
		return LatestPrice;
	}

	public void setLatestPrice(String latestPrice) {
		LatestPrice = latestPrice;
	}

	public String getChange() {
		return Change;
	}

	public void setChange(String change) {
		Change = change;
	}

	public String getChangePercent() {
		return ChangePercent;
	}

	public void setChangePercent(String changePercent) {
		ChangePercent = changePercent;
	}

	public String getWeek52High() {
		return Week52High;
	}

	public void setWeek52High(String week52High) {
		Week52High = week52High;
	}

	public String getWeek52Low() {
		return Week52Low;
	}

	public void setWeek52Low(String week52Low) {
		Week52Low = week52Low;
	}

	public String getYtdChange() {
		return YtdChange;
	}

	public void setYtdChange(String ytdChange) {
		YtdChange = ytdChange;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
