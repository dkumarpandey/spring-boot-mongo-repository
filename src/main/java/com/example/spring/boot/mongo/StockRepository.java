package com.example.spring.boot.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, Integer> {
	public Stock findBySymbol(String symbol);
}
