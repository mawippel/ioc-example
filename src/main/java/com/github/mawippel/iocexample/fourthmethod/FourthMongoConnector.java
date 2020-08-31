package com.github.mawippel.iocexample.fourthmethod;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mongoConnector")
public class FourthMongoConnector implements FourthDatabaseConector {

	@Override
	public void connect() {
		System.out.println("Fourth - Connecting to Mongo");
	}

}
