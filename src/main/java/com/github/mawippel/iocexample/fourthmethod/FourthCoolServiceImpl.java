package com.github.mawippel.iocexample.fourthmethod;

import org.springframework.stereotype.Service;

/**
 * CONDITION-BASED INJECTION (Externalized configuration) 
 */
@Service
public class FourthCoolServiceImpl implements FourthCoolService {
	
	private FourthDatabaseConector databaseConnector;

	public FourthCoolServiceImpl(FourthDatabaseConector databaseConnector) {
		this.databaseConnector = databaseConnector;
	}
	
	@Override
	public void coolMethod() {
		databaseConnector.connect();
	}

}
