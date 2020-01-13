package com.stock.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.stock.history.domain.SearchHistory;

@RepositoryRestResource(collectionResourceRel = "searchHistory", path = "searchHistory")
public interface SearchHistoryRepository extends MongoRepository<SearchHistory, String> {
	
	List<SearchHistory> findByEmail(final String email);
}
