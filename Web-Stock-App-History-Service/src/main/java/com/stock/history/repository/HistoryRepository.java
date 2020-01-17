package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.history.model.BaseHistory;

public interface HistoryRepository extends MongoRepository<BaseHistory , String> {

	List<BaseHistory> findByEmail(final String email);
}
