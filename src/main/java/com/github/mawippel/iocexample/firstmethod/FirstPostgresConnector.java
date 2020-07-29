package com.github.mawippel.iocexample.firstmethod;

import org.springframework.stereotype.Repository;

@Repository
public class FirstPostgresConnector implements FirstDatabaseConector {

	@Override
	public void connect() {
		System.out.println("First - Connecting to Postgres");
	}

}
