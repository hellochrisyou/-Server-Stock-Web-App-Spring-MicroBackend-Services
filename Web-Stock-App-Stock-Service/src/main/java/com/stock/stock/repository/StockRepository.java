package com.stock.stock.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stock.stock.model.Stock;

public interface StockRepository extends MongoRepository<Stock , String> {
	
	List<Stock> findByEmail(final String email);

	Stock findBySymbolNull(final String symbol);

	Stock findBySymbol(final String symbol);
	
	void deleteBySymbol(final String symbol);
}
