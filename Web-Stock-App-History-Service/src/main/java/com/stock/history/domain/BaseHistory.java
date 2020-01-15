package com.stock.history.domain;

import java.text.SimpleDateFormat;  
import java.util.Date;  
import org.springframework.data.annotation.Id;
import java.util.Map;

//@Document
public class BaseHistory {
	
//	public ObjectId id = new ObjectId();
//	public String email = "";
//	public String action = "";
//	public Date timeOfAction = new Date();
		
	@Id
	public String id;	
	public String email = "";
	public String title = "";
	public Date dateRecorded = new Date();
	
	BaseHistory(){}
	
	public BaseHistory(String id, String email, String title, Date dateRecorded) {
		super();
		this.id = id;
		this.email = email;
		this.title = title;
		this.dateRecorded = dateRecorded;
	}

	public BaseHistory(BaseHistory argBaseHistory) {
		this.email = argBaseHistory.getEmail();
		this.title = argBaseHistory.getTitle();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    this.dateRecorded = date;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateRecorded() {
		return dateRecorded;
	}
	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}	
	
	
}
