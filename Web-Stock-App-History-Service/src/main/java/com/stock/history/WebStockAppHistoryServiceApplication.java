package com.stock.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.stock.history.repository.ActivityHistoryRepository;
import com.stock.history.repository.SearchHistoryRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {ActivityHistoryRepository.class, SearchHistoryRepository.class})
public class WebStockAppHistoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStockAppHistoryServiceApplication.class, args);
	}

}
