package com.stock.history.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "baseHistory")
public class BaseHistory {
		
	@Id
	public String  id;	
	public String email = "";
	public String title = "";
	public String type = "";
//	public Date dateRecorded;
	
	public BaseHistory(){}

	public BaseHistory(final String id, final String email, final String type, final Date dateRecorded) {
		this.id = id;
		this.email = email;
		this.type = type;
//		this.dateRecorded = dateRecorded;
	}
	
	public BaseHistory(BaseHistory history) {
		this.email = history.getEmail();
		this.title = history.getTitle();
		this.type = history.getType();
//		this.dateRecorded = baseHistory.getDateRecorded();
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

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

//	public Date getDateRecorded() {
//		return dateRecorded;
//	}
//
//	public void setDateRecorded() {
//		this.dateRecorded = Calendar.getInstance().getTime();
//
//	}
//
//	@Override
//	public String toString() {
//		return "BaseHistory [id=" + id + ", email=" + email + ", title=" + title + ", type=" + type + ", dateRecorded="
//				+ dateRecorded + "]";
//	}

	
	
}
