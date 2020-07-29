package com.github.mawippel.iocexample.secondmethod;

import org.springframework.stereotype.Service;

@Service
public class SecondCoolServiceImpl implements SecondCoolService {

private SecondDatabaseConector databaseConnector;
	
	// After Spring 4.3 it's no longer necessary to add @Autowired annotation to the constructor
	// @see http://olivergierke.de/2013/11/why-field-injection-is-evil/
	public SecondCoolServiceImpl(SecondDatabaseConector databaseConnector) {
		this.databaseConnector = databaseConnector;
	}

	@Override
	public void coolMethod() {
		databaseConnector.connect();
	}

}
