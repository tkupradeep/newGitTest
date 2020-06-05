package com.abc.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello()
	{
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>First Spring Boot and Git hub App</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>Hello World</h1>\r\n" + 
				"<p>Welcome to Spring Boot App!</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
	}
}
