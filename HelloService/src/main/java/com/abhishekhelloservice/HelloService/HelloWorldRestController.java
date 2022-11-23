package com.abhishekhelloservice.HelloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWorldRestController {
	
	@GetMapping(value = "/hello")
	public String sayHello()
	{
		return "helloService";
	}

}
