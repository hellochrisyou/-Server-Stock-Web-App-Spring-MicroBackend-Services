package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.stock.history.domain.ActivityHistory;


//@RepositoryRestResource(collectionResourceRel = "activityHistory", path = "activityHistory")
public interface ActivityHistoryRepository extends MongoRepository<ActivityHistory , String> {
	
	List<ActivityHistory> findByEmail(final String email);
}
