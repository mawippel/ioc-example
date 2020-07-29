package com.github.mawippel.iocexample.secondmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SecondExampleController {

	@Autowired
	private SecondCoolService coolService;
	
	@GetMapping
	private void ping() {
		coolService.coolMethod();
	}
	
}
