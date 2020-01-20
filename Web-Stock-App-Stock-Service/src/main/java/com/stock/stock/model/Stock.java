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
		Map check = (Map) stock;
		this.Change = asDouble(check.get("Change"));
		this.ChangePercent = asDouble(check.get("ChangePercent")); 
		this.email =  (String) check.get("email");
		this.Exchange = (String) check.get("Exchange");
		this.High = asDouble(check.get("High"));
		this.LatestPrice = asDouble(check.get("LatestPrice"));
		this.Low = asDouble(check.get("Low"));
		this.Name = (String) check.get("Name");
		this.Open = asDouble(check.get("Open"));
		this.Symbol = (String) check.get("Symbol");
		this.Week52High = asDouble(check.get("Week52High"));
		this.Week52Low = asDouble(check.get("Week52Low"));
		this.YtdChange =asDouble(check.get("YtdChange"));
	}

	Double asDouble(Object o) {
	    Double val = null;
	    if (o instanceof Number) {
	        val = ((Number) o).doubleValue();
	    }
	    return val;
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
