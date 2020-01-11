package com.stock.list.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.stock.list.command.UserListForm;
import com.stock.list.domain.UserList;

@Component
public class UserListToUserListForm implements Converter<UserList, UserListForm> {

	@Override
	public UserListForm convert(UserList userList) {

		UserListForm userListForm = new UserListForm();
		userListForm.setEmail(userList.getEmail());
		userListForm.setList(userList.getList());

		return userListForm;
	}
}
