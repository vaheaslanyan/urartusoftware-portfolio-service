package com.urartusoftware.urartusoftwareportfolioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class UrartusoftwareportfolioserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrartusoftwareportfolioserviceApplication.class, args);
	}

}
