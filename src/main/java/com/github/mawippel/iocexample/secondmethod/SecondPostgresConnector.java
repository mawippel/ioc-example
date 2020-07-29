package com.github.mawippel.iocexample.secondmethod;

import org.springframework.stereotype.Repository;

@Repository
public class SecondPostgresConnector implements SecondDatabaseConector {

	@Override
	public void connect() {
		System.out.println("Second - Connecting to Postgres");
	}

}
