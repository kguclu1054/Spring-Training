package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {
	
	
	//localhost:8080/hello
	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello World";

	}
	
	@PostMapping(path = "/save")
	public String save() {
		return "Data Saved!";
	}
	
	@DeleteMapping(path = "/delete")
	public String delete() {
		return "Data deleted!";
	}
	
	@PutMapping(path = "/put")
	public String put() {
		return "Data Puting!";
	}
	
	@GetMapping(path = "/message/{message}")
	public String getMyMessage(@PathVariable String message) {
		return "Your message is : " + message;
	}
	
	@PutMapping(path = "/message/{message}") 
	public String updateMyMessage(@PathVariable String message) {  
		return "Updated message is: " + message; 
		}
	
	@GetMapping(path = "/message2")
	public String getMyMessage_2(@RequestParam String message2) {
		return "Your message is :"+ message2;
	}

}
