package com.stock.history.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.history.domain.ActivityHistory;

public interface ActivityHistoryRepository extends MongoRepository<ActivityHistory , String> {
	
	List<ActivityHistory> findByEmail(final String email);
}
