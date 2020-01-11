package com.stock.list.convert;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.stock.list.command.UserListForm;
import com.stock.list.domain.UserList;

@Component
public class UserListFormToUserList implements Converter<UserListForm, UserList> {

    @Override
    public UserList convert(UserListForm userListForm) {
    	UserList userList = new UserList();
        if (userListForm.getId() != null  && !StringUtils.isEmpty(userListForm.getId())) {
        	userList.setId(new ObjectId(userListForm.getId()));
        }
        userList.setEmail(userListForm.getEmail());
        userList.setList(userListForm.getList());
        
        return userList;
    }
}