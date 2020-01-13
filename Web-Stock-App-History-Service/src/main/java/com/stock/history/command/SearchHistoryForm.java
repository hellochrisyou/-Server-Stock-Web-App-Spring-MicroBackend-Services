//package com.stock.history.command;
//
//import java.util.Date;
//
//import org.springframework.data.annotation.Id;
//
//public class SearchHistoryForm implements BaseHistoryForm {
//
//	private String action;
//	private String email;
//	@Id
//	private String id; 
//	private Date timeOfAction;
//	private String title;
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
//	public String getTitle() {
//		return title;
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
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	@Override
//	public String toString() {
//		return "SearchHistoryForm [id=" + id + ", email=" + email + ", action=" + action + ", title=" + title
//				+ ", timeOfAction=" + timeOfAction + "]";
//	}
//	
//	
//}
