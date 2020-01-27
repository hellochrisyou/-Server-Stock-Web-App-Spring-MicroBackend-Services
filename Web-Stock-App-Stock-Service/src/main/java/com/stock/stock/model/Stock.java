package com.stock.stock.model;

import java.util.Map;

public class Stock {

	private String Select = "Select";
	private String Chart = "Chart";	
	private String email;
	private String symbol;	
	private String exchange;
	private String name;
	private String open;
	private String low;
	private String high;
	private String latestPrice;
	private String change;
	private String changePercent;
	private String stateId;
	private String week52High;
	private String week52Low;
	private String ytdChange;

	public Stock() {
	}

	public Stock(@SuppressWarnings("rawtypes") Map stockMap) {
		this.change = stockMap.get("change") != null ? asDouble(stockMap.get("change")).toString(): "n/a";		
		this.changePercent = stockMap.get("changePercent") != null ? asDouble(stockMap.get("changePercent")).toString(): "n/a";			 
		this.email =  (String) stockMap.get("email");
		this.exchange = (String) stockMap.get("exchange");
		this.high = stockMap.get("high").toString();	
		this.latestPrice = stockMap.get("latestPrice").toString();
		this.low = stockMap.get("low").toString();
		this.name = (String) stockMap.get("name");
		this.open = stockMap.get("open").toString();
		this.symbol = (String) stockMap.get("symbol");
		this.week52High = stockMap.get("week52High").toString();	
		this.week52Low = stockMap.get("week52Low").toString();	
		this.ytdChange = stockMap.get("ytdChange").toString();	
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

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(String latestPrice) {
		this.latestPrice = latestPrice;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getWeek52High() {
		return week52High;
	}

	public void setWeek52High(String week52High) {
		this.week52High = week52High;
	}

	public String getWeek52Low() {
		return week52Low;
	}

	public void setWeek52Low(String week52Low) {
		this.week52Low = week52Low;
	}

	public String getYtdChange() {
		return ytdChange;
	}

	public void setYtdChange(String ytdChange) {
		this.ytdChange = ytdChange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Chart == null) ? 0 : Chart.hashCode());
		result = prime * result + ((Select == null) ? 0 : Select.hashCode());
		result = prime * result + ((change == null) ? 0 : change.hashCode());
		result = prime * result + ((changePercent == null) ? 0 : changePercent.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((exchange == null) ? 0 : exchange.hashCode());
		result = prime * result + ((high == null) ? 0 : high.hashCode());
		result = prime * result + ((latestPrice == null) ? 0 : latestPrice.hashCode());
		result = prime * result + ((low == null) ? 0 : low.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
		result = prime * result + ((stateId == null) ? 0 : stateId.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((week52High == null) ? 0 : week52High.hashCode());
		result = prime * result + ((week52Low == null) ? 0 : week52Low.hashCode());
		result = prime * result + ((ytdChange == null) ? 0 : ytdChange.hashCode());
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
		if (change == null) {
			if (other.change != null)
				return false;
		} else if (!change.equals(other.change))
			return false;
		if (changePercent == null) {
			if (other.changePercent != null)
				return false;
		} else if (!changePercent.equals(other.changePercent))
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
		if (high == null) {
			if (other.high != null)
				return false;
		} else if (!high.equals(other.high))
			return false;
		if (latestPrice == null) {
			if (other.latestPrice != null)
				return false;
		} else if (!latestPrice.equals(other.latestPrice))
			return false;
		if (low == null) {
			if (other.low != null)
				return false;
		} else if (!low.equals(other.low))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (open == null) {
			if (other.open != null)
				return false;
		} else if (!open.equals(other.open))
			return false;
		if (stateId == null) {
			if (other.stateId != null)
				return false;
		} else if (!stateId.equals(other.stateId))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (week52High == null) {
			if (other.week52High != null)
				return false;
		} else if (!week52High.equals(other.week52High))
			return false;
		if (week52Low == null) {
			if (other.week52Low != null)
				return false;
		} else if (!week52Low.equals(other.week52Low))
			return false;
		if (ytdChange == null) {
			if (other.ytdChange != null)
				return false;
		} else if (!ytdChange.equals(other.ytdChange))
			return false;
		return true;
	}

			
}
