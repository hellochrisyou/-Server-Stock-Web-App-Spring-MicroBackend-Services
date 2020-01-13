package com.stock.history.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

//@Document
public interface BaseHistory {
	
//	public ObjectId id = new ObjectId();
//	public String email = "";
//	public String action = "";
//	public Date timeOfAction = new Date();
		
	@Id
	public String id = "";	
	public String email = "";
	public String action = "";
	public Date dateRecorded = new Date();	
}
