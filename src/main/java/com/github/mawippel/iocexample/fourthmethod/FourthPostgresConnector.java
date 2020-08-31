package com.github.mawippel.iocexample.fourthmethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("postgresConnector")
public class FourthPostgresConnector implements FourthDatabaseConector {

	@Override
	public void connect() {
		System.out.println("Fourth - Connecting to Postgres");
	}

}
