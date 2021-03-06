package com.rky.dev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("/Say/{name}")
	public String sayHelloStr(@PathVariable String name) {
		
		log.info("Name received (GIT) : {}", name);
		return "Hello from GIT>>>>>>>>>>>>>>>>> :- "+name;
	}
}
