package com.stock.history.domain;

import java.util.Date;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class History {
	@Id
	private ObjectId id;
	private String email;
	private String action; 
	private String title;
	private Date timeOfAction;
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
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getTimeOfAction() {
		return timeOfAction;
	}
	public void setTimeOfAction(Date timeOfAction) {
		this.timeOfAction = timeOfAction;
	}
	
	
}
