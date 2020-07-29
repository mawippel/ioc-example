package com.github.mawippel.iocexample.firstmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstExampleController {

	@Autowired
	private FirstCoolService coolService;
	
	@GetMapping
	private void ping() {
		coolService.coolMethod();
	}
	
}
