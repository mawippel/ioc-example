package com.github.mawippel.iocexample.fourthmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

	@Bean
	public FourthDatabaseConector databaseConnector() {
		return new FourthMongoConnector();
	}
	
}
