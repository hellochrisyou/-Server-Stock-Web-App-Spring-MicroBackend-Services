package com.stock.stock.model;

import java.util.Map;

public class Stock {

	private String Select = "Select";
	private String Chart = "Chart";	
	private String email;
	private String Symbol;	
	private String Exchange;
	private String Name;
	private double Open;
	private double Low;
	private double High;
	private double LatestPrice;
	private double Change;
	private double ChangePercent;
	private int stateId;
	private double Week52High;
	private double Week52Low;
	private double YtdChange;

	public Stock() {
	}

	public Stock(Object stock) {
		Map stockMap = (Map) stock;
		this.Change = stockMap.get("Change") != null ? asDouble(stockMap.get("Change")): Double.NaN;		
		this.ChangePercent = stockMap.get("ChangePercent") != null ? asDouble(stockMap.get("ChangePercent")): Double.NaN;		 
		this.email =  (String) stockMap.get("email");
		this.Exchange = (String) stockMap.get("Exchange");
		this.High = stockMap.get("High") != null ? asDouble(stockMap.get("High")): Double.NaN;	
		this.LatestPrice = stockMap.get("LatestPrice") != null ? asDouble(stockMap.get("LatestPrice")): Double.NaN;	
		this.Low = stockMap.get("Low") != null ? asDouble(stockMap.get("Low")): Double.NaN;	
		this.Name = (String) stockMap.get("Name");
		this.Open = stockMap.get("Open") != null ? asDouble(stockMap.get("Open")): Double.NaN;	
		this.Symbol = (String) stockMap.get("Symbol");
		this.Week52High = stockMap.get("Week52High") != null ? asDouble(stockMap.get("Week52High")): Double.NaN;	
		this.Week52Low = stockMap.get("Week52Low") != null ? asDouble(stockMap.get("Week52Low")): Double.NaN;	
		this.YtdChange = stockMap.get("YtdChange") != null ? asDouble(stockMap.get("YtdChange")): Double.NaN;	
	}

	Double asDouble(Object o) {
		if (o != null) {
	    Double val = null;
	    if (o instanceof Number) {
	        val = ((Number) o).doubleValue();
	    }
	    return val;
	    } else {
	    	return null;
	    }
	    	
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getOpen() {
		return Open;
	}

	public void setOpen(double open) {
		Open = open;
	}

	public double getLow() {
		return Low;
	}

	public void setLow(double low) {
		Low = low;
	}

	public double getHigh() {
		return High;
	}

	public void setHigh(double high) {
		High = high;
	}

	public double getLatestPrice() {
		return LatestPrice;
	}

	public void setLatestPrice(double latestPrice) {
		LatestPrice = latestPrice;
	}

	public double getChange() {
		return Change;
	}

	public void setChange(double change) {
		Change = change;
	}

	public double getChangePercent() {
		return ChangePercent;
	}

	public void setChangePercent(double changePercent) {
		ChangePercent = changePercent;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public double getWeek52High() {
		return Week52High;
	}

	public void setWeek52High(double week52High) {
		Week52High = week52High;
	}

	public double getWeek52Low() {
		return Week52Low;
	}

	public void setWeek52Low(double week52Low) {
		Week52Low = week52Low;
	}

	public double getYtdChange() {
		return YtdChange;
	}

	public void setYtdChange(double ytdChange) {
		YtdChange = ytdChange;
	}

	
}
