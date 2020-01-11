package com.stock.list.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.list.domain.UserList;

public interface UserListRepository extends JpaRepository<UserList, String> {
	
	@Override
	List<UserList> findAll();
	
	List<UserList> findByEmail(final String email);
}
