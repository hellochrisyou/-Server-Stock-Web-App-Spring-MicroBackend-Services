package com.stock.history.domain;

import java.util.Date;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.stock.history.command.SearchHistoryForm;

@Document(collection = "SearchHistory")
public class SearchHistory implements BaseHistory {
	
//	@Id
//	private ObjectId id;
//	private String email;
//	private String action;
//	private Date timeOfAction;
//
//	public ObjectId getId() {
//		return id;
//	}
//	public void setId(ObjectId id) {
//		this.id = id;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getAction() {
//		return action;
//	}
//	public void setAction(String action) {
//		this.action = action;
//	}
//	public Date getTimeOfAction() {
//		return timeOfAction;
//	}
//	public void setTimeOfAction(Date timeOfAction) {
//		this.timeOfAction = timeOfAction;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((action == null) ? 0 : action.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((timeOfAction == null) ? 0 : timeOfAction.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof SearchHistory)) {
//			return false;
//		}
//		SearchHistory other = (SearchHistory) obj;
//		if (action == null) {
//			if (other.action != null) {
//				return false;
//			}
//		} else if (!action.equals(other.action)) {
//			return false;
//		}
//		if (email == null) {
//			if (other.email != null) {
//				return false;
//			}
//		} else if (!email.equals(other.email)) {
//			return false;
//		}
//		if (id == null) {
//			if (other.id != null) {
//				return false;
//			}
//		} else if (!id.equals(other.id)) {
//			return false;
//		}
//		if (timeOfAction == null) {
//			if (other.timeOfAction != null) {
//				return false;
//			}
//		} else if (!timeOfAction.equals(other.timeOfAction)) {
//			return false;
//		}
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "SearchHistory [id=" + id + ", email=" + email + ", action=" + action + ", timeOfAction=" + timeOfAction
//				+ "]";
//	}
	
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
		return "SearchHistory [id=" + id + ", email=" + email + ", action=" + action
				+ ", timeOfAction=" + timeOfAction + "]";
	}
	
	
}
