package com.stock.history.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ActivityHistory")
public class ActivityHistory implements BaseHistory {

	@Id
	private String id;
	private String email;
	private String action; 
	private Date timeOfAction;
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
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getTimeOfAction() {
		return timeOfAction;
	}
	public void setTimeOfAction(Date timeOfAction) {
		this.timeOfAction = timeOfAction;
	}
	@Override
	public String toString() {
		return "ActivityHistory [id=" + id + ", email=" + email + ", action=" + action + ", timeOfAction="
				+ timeOfAction + "]";
	}
	
}