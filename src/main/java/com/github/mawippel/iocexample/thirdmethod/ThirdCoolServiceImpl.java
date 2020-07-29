package com.github.mawippel.iocexample.thirdmethod;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ThirdCoolServiceImpl implements ThirdCoolService {
	
	@Autowired
    private Map<String, ThirdDatabaseConector> databaseConnectors;
    
    // This comes from the property file as a key for the Map
    @Value("${database.connector}")
    private String databaseConnectorKey;
    
	@Override
	public void coolMethod() {
		databaseConnectors.get(databaseConnectorKey).connect();
	}

}
