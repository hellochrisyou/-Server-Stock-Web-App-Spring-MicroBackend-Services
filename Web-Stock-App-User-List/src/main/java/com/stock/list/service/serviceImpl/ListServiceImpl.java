package com.stock.list.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.stock.list.command.UserListForm;
import com.stock.list.convert.UserListFormToUserList;
import com.stock.list.domain.UserList;
import com.stock.list.repository.UserListRepository;
import com.stock.list.service.UserListService;

public class ListServiceImpl implements UserListService{
	
	@Autowired
	private UserListRepository userListRepository;
	@Autowired
    private UserListFormToUserList userListFormToUserList;

 

    @Override
    public List<UserList> listAll() {
        List<UserList> userLists = new ArrayList<>();
        userListRepository.findAll().forEach(userLists::add); //fun with Java 8
        return userLists;
    }

    @Override
    public UserList getById(String id) {
        return userListRepository.findById(id).orElse(null);
    }
    
    @Override
    public List<UserList> getByEmail(String email) {
    	return userListRepository.findByEmail(email);
    }

    @Override
    public UserList saveOrUpdate(UserList userList) {
        userListRepository.save(userList);
        return userList;
    }

    @Override
    public void delete(String id) {
        userListRepository.deleteById(id);
    }

    @Override
    public UserList saveOrUpdateProductForm(UserListForm userListForm) {
    	UserList savedUserList = saveOrUpdate(userListFormToUserList.convert(userListForm));

        System.out.println("Saved UserList Id: " + savedUserList.getId());
        return savedUserList;
    }

}
