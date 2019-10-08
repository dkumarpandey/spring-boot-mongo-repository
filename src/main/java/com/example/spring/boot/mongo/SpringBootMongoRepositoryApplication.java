package com.example.spring.boot.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMongoRepositoryApplication {

	@RequestMapping("/stocks")
	private Stock stocks() {
		Stock stock = new Stock();
		stock.setCompanyName("Tesla");
		stock.setSymbol("TLSA");
		stock.setCeo("Elon Musk");
		stock.setPrice(250.00d);

		repo.save(stock);
		return repo.findBySymbol("TLSA");
	}

	@Autowired
	private StockRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoRepositoryApplication.class, args);
	}

}
