package com.stock.list.service;

import java.util.List;

import com.stock.list.command.UserListForm;
import com.stock.list.domain.UserList;

public interface UserListService {

	List<UserList> listAll();

	UserList getById(String id);

	UserList getByEmail(String email);
	
	UserList saveOrUpdate(UserList tag);

	void delete(String id);

	UserList saveOrUpdateProductForm(UserListForm tagForm);
}
