package com.stock.history.model;

import java.util.Calendar;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "baseHistory")
public class BaseHistory {
		
	@Id
	public long  id;	
	public String email = "";
	public String title = "";
	public String type = "";
	public Date dateRecorded;
	
	public BaseHistory(){}

	public BaseHistory(final long id, final String email, final String type, final Date dateRecorded) {
		super();
		this.id = id;
		this.email = email;
		this.type = type;
		this.dateRecorded = dateRecorded;
	}
	
	public BaseHistory(BaseHistory baseHistory) {
		super();
		this.id = baseHistory.getId();
		this.email = baseHistory.getEmail();
		this.type = baseHistory.getType();
		this.dateRecorded = baseHistory.getDateRecorded();
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
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

	public Date getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded() {
		this.dateRecorded = Calendar.getInstance().getTime();

	}

	@Override
	public String toString() {
		return "BaseHistory [id=" + id + ", email=" + email + ", title=" + title + ", type=" + type + ", dateRecorded="
				+ dateRecorded + "]";
	}

	
	
}
