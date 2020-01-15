package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.stock.history.domain.BaseHistory;

@Repository
@RepositoryRestResource(collectionResourceRel = "activityHistory", path = "activityHistory")
public interface HistoryRepository extends MongoRepository<BaseHistory , String> {
	
	boolean existsByEmail(final String emailInput);
	
	List<BaseHistory> findByEmail(final String email);
}
