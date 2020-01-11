package com.stock.history.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.history.domain.History;

public interface HistoryRepository extends JpaRepository<History, String> {
	
	@Override
	List<History> findAll();
	
	History findByEmail(final String email);
}
