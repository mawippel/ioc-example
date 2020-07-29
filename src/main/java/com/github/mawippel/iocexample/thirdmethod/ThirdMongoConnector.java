package com.github.mawippel.iocexample.thirdmethod;

import org.springframework.stereotype.Repository;

@Repository("mongoConnector")
public class ThirdMongoConnector implements ThirdDatabaseConector {

	@Override
	public void connect() {
		System.out.println("Third - Connecting to Mongo");
	}

}
