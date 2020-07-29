package com.github.mawippel.iocexample.thirdmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("third")
public class ThirdExampleController {

	@Autowired
	private ThirdCoolService coolService;
	
	@GetMapping
	private void ping() {
		coolService.coolMethod();
	}
	
}
