package com.stock.history.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class ResponseHistory {

	@Id
	public String  id;
	public String email;
	private List<BaseHistory> historyList = new ArrayList<>();
	
	public ResponseHistory(){};
	
	public ResponseHistory(List<BaseHistory> history) {		
		this.historyList = history;
	}

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

	public List<BaseHistory> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(List<BaseHistory> historyList) {
		this.historyList = historyList;
	}
}
