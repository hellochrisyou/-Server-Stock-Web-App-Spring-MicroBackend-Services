package com.stock.stock.model;

import java.util.Map;

public class Stock {

	private String Select = "Select";
	private String Chart = "Chart";	
	private String email;
	private String symbol;	
	private String exchange;
	private String name;
	private double open;
	private double low;
	private double high;
	private double latestPrice;
	private double change;
	private double changePercent;
	private int stateId;
	private double week52High;
	private double week52Low;
	private double ytdChange;

	public Stock() {
	}

	public Stock(@SuppressWarnings("rawtypes") Map stockMap) {
		this.change = stockMap.get("change") != null ? asDouble(stockMap.get("change")): Double.NaN;		
		this.changePercent = stockMap.get("changePercent") != null ? asDouble(stockMap.get("changePercent")): Double.NaN;		 
		this.email =  (String) stockMap.get("email");
		this.exchange = (String) stockMap.get("exchange");
		this.high = stockMap.get("high") != null ? asDouble(stockMap.get("high")): Double.NaN;	
		this.latestPrice = stockMap.get("latestPrice") != null ? asDouble(stockMap.get("latestPrice")): Double.NaN;	
		this.low = stockMap.get("low") != null ? asDouble(stockMap.get("low")): Double.NaN;	
		this.name = (String) stockMap.get("name");
		this.open = stockMap.get("open") != null ? asDouble(stockMap.get("open")): Double.NaN;	
		this.symbol = (String) stockMap.get("symbol");
		this.week52High = stockMap.get("week52High") != null ? asDouble(stockMap.get("week52High")): Double.NaN;	
		this.week52Low = stockMap.get("week52Low") != null ? asDouble(stockMap.get("week52Low")): Double.NaN;	
		this.ytdChange = stockMap.get("ytdChange") != null ? asDouble(stockMap.get("ytdChange")): Double.NaN;	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(double latestPrice) {
		this.latestPrice = latestPrice;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(double changePercent) {
		this.changePercent = changePercent;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public double getWeek52High() {
		return week52High;
	}

	public void setWeek52High(double week52High) {
		this.week52High = week52High;
	}

	public double getWeek52Low() {
		return week52Low;
	}

	public void setWeek52Low(double week52Low) {
		this.week52Low = week52Low;
	}

	public double getYtdChange() {
		return ytdChange;
	}

	public void setYtdChange(double ytdChange) {
		this.ytdChange = ytdChange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Chart == null) ? 0 : Chart.hashCode());
		result = prime * result + ((Select == null) ? 0 : Select.hashCode());
		long temp;
		temp = Double.doubleToLongBits(change);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(changePercent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		temp = Double.doubleToLongBits(high);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(latestPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(low);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(open);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stateId;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		temp = Double.doubleToLongBits(week52High);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(week52Low);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ytdChange);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (Chart == null) {
			if (other.Chart != null)
				return false;
		} else if (!Chart.equals(other.Chart))
			return false;
		if (Select == null) {
			if (other.Select != null)
				return false;
		} else if (!Select.equals(other.Select))
			return false;
		if (Double.doubleToLongBits(change) != Double.doubleToLongBits(other.change))
			return false;
		if (Double.doubleToLongBits(changePercent) != Double.doubleToLongBits(other.changePercent))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (exchange == null) {
			if (other.exchange != null)
				return false;
		} else if (!exchange.equals(other.exchange))
			return false;
		if (Double.doubleToLongBits(high) != Double.doubleToLongBits(other.high))
			return false;
		if (Double.doubleToLongBits(latestPrice) != Double.doubleToLongBits(other.latestPrice))
			return false;
		if (Double.doubleToLongBits(low) != Double.doubleToLongBits(other.low))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(open) != Double.doubleToLongBits(other.open))
			return false;
		if (stateId != other.stateId)
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (Double.doubleToLongBits(week52High) != Double.doubleToLongBits(other.week52High))
			return false;
		if (Double.doubleToLongBits(week52Low) != Double.doubleToLongBits(other.week52Low))
			return false;
		if (Double.doubleToLongBits(ytdChange) != Double.doubleToLongBits(other.ytdChange))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [Select=" + Select + ", Chart=" + Chart + ", email=" + email + ", symbol=" + symbol
				+ ", exchange=" + exchange + ", name=" + name + ", open=" + open + ", low=" + low + ", high=" + high
				+ ", latestPrice=" + latestPrice + ", change=" + change + ", changePercent=" + changePercent
				+ ", stateId=" + stateId + ", week52High=" + week52High + ", week52Low=" + week52Low + ", ytdChange="
				+ ytdChange + "]";
	}

		
}
