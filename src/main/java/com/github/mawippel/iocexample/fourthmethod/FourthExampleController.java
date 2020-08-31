package com.github.mawippel.iocexample.fourthmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fourth")
public class FourthExampleController {

	@Autowired
	private FourthCoolService coolService;
	
	@GetMapping
	private void ping() {
		coolService.coolMethod();
	}
	
}
