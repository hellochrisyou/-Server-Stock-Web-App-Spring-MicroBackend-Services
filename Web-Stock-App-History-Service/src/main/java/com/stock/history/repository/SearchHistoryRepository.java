package com.stock.history.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.history.domain.SearchHistory;

public interface SearchHistoryRepository extends MongoRepository<SearchHistory, String> {
	
	List<SearchHistory> findByEmail(final String email);
}
