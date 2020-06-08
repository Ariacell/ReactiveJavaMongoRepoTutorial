package com.webflux.tutorial.webluxTute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class WebluxTuteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebluxTuteApplication.class, args);
	}

}
