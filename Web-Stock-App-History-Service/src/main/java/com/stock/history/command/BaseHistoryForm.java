package com.stock.history.command;

import java.util.Date;

import javax.persistence.Id;

import org.bson.types.ObjectId;

public interface BaseHistoryForm {

	@Id
	public String id = "";
	public String email = "";
	public String action = "";
	public Date timeOfAction = new Date();	
}
