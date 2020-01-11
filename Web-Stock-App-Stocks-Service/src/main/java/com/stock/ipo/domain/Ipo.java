package com.stock.ipo.domain;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ipo {

	@Id
	private ObjectId id;
	private String email;
	private String symbol;
	private String name;
	private String market;
	private String city;
	private String state;
	private String ceo;
	private String url;
	private float sharedOffered;
	private float priceLow;
	private float priceHigh;
	private float revenue;
	private float netIncome;
	private float totalAssets;
	private float stockHolderEquity;
	private String companyDesc;
	private String businessDesc;
	private String useOfProceeds;
	private String competition;
	private float amount;
	private float percentOffered;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public float getSharedOffered() {
		return sharedOffered;
	}
	public void setSharedOffered(float sharedOffered) {
		this.sharedOffered = sharedOffered;
	}
	public float getPriceLow() {
		return priceLow;
	}
	public void setPriceLow(float priceLow) {
		this.priceLow = priceLow;
	}
	public float getPriceHigh() {
		return priceHigh;
	}
	public void setPriceHigh(float priceHigh) {
		this.priceHigh = priceHigh;
	}
	public float getRevenue() {
		return revenue;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public float getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(float netIncome) {
		this.netIncome = netIncome;
	}
	public float getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(float totalAssets) {
		this.totalAssets = totalAssets;
	}
	public float getStockHolderEquity() {
		return stockHolderEquity;
	}
	public void setStockHolderEquity(float stockHolderEquity) {
		this.stockHolderEquity = stockHolderEquity;
	}
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	public String getBusinessDesc() {
		return businessDesc;
	}
	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}
	public String getUseOfProceeds() {
		return useOfProceeds;
	}
	public void setUseOfProceeds(String useOfProceeds) {
		this.useOfProceeds = useOfProceeds;
	}
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		this.competition = competition;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getPercentOffered() {
		return percentOffered;
	}
	public void setPercentOffered(float percentOffered) {
		this.percentOffered = percentOffered;
	}
	
	
}
