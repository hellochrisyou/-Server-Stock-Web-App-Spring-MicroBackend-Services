package com.stock.ipo.command;

import javax.persistence.Id;

public class TagForm {
	
	@Id
	private String id;
	private String email;
	private String name;
	private String exchange;
	private float open;
	private float low;
	private float high;
	private float latestPrice;
	private float change;
	private float changePercent;
	private float week52Low;
	private float week52High;
	private float ytdChange;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getLatestPrice() {
		return latestPrice;
	}
	public void setLatestPrice(float latestPrice) {
		this.latestPrice = latestPrice;
	}
	public float getChange() {
		return change;
	}
	public void setChange(float change) {
		this.change = change;
	}
	public float getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(float changePercent) {
		this.changePercent = changePercent;
	}
	public float getWeek52Low() {
		return week52Low;
	}
	public void setWeek52Low(float week52Low) {
		this.week52Low = week52Low;
	}
	public float getWeek52High() {
		return week52High;
	}
	public void setWeek52High(float week52High) {
		this.week52High = week52High;
	}
	public float getYtdChange() {
		return ytdChange;
	}
	public void setYtdChange(float ytdChange) {
		this.ytdChange = ytdChange;
	}
	
	
}
