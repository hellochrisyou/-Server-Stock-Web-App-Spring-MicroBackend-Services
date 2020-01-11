package com.stock.list.command;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

public class UserListForm {

	@Id
	private String id;
	private String email;
	private Date dateCreated;
	private String type;
	private List<String> list;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
