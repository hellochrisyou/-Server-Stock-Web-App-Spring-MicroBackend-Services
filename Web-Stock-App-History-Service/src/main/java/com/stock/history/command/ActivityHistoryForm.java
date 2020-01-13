//package com.stock.history.command;
//
//import java.util.Date;
//
//import javax.persistence.Id;
//
//public class ActivityHistoryForm implements BaseHistoryForm {
//
//	private String action;
//	private String email;
//	@Id
//	private String id; 
//	private Date timeOfAction;
//	
//	public String getAction() {
//		return action;
//	}
//	public String getEmail() {
//		return email;
//	}	
//	public String getId() {
//		return id;
//	}
//	public Date getTimeOfAction() {
//		return timeOfAction;
//	}
//	public void setAction(String action) {
//		this.action = action;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public void setTimeOfAction(Date timeOfAction) {
//		this.timeOfAction = timeOfAction;
//	}
//	@Override
//	public String toString() {
//		return "ActivityHistoryForm [id=" + id + ", email=" + email + ", action=" + action + ", timeOfAction="
//				+ timeOfAction + "]";
//	}
//	
//}
