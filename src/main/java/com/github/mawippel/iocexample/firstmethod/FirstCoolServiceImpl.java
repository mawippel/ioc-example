package com.github.mawippel.iocexample.firstmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FIELD INJECTION
 */
@Service
public class FirstCoolServiceImpl implements FirstCoolService {

	@Autowired
	private FirstDatabaseConector databaseConnector;
	
	@Override
	public void coolMethod() {
		databaseConnector.connect();
	}

}
