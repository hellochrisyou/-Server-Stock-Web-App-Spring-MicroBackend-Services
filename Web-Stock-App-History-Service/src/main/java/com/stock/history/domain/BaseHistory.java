package com.stock.history.domain;

import java.util.Date;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

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
	public Date timeOfAction = new Date();	
}
