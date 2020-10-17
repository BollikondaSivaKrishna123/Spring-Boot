package com.nt.ssit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hello")
public String sayHello()
{
	return "<h1 style=color:red;><b>Welcome to First Spring Boot Application Using Eclipse</b></h1>";
}
}
