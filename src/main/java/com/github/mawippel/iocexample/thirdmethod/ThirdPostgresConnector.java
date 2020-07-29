package com.github.mawippel.iocexample.thirdmethod;

import org.springframework.stereotype.Repository;

@Repository("postgresConnector")
public class ThirdPostgresConnector implements ThirdDatabaseConector {

	@Override
	public void connect() {
		System.out.println("Third - Connecting to Postgres");
	}

}
