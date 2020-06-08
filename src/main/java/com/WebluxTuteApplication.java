package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@EnableReactiveMongoRepositories
public class WebluxTuteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebluxTuteApplication.class, args);
	}


}
