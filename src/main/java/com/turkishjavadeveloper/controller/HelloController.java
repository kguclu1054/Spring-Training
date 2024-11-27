package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkishjavadeveloper.model.User;

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
	
	@GetMapping(path = {"/message3", "/message3/{message}"})
	public String getMyMessageWithVariable(@PathVariable(name = "message", required = false)String message) {
		if (message == null) { 
			return "Your message is: null"; 
		} else { 
			return "Your message is: " + message; 
	  }
	}
	
	@GetMapping(path = "/message4")
	public String getMyMessageParam(@RequestParam(name = "message", required = false)String message) {
		return "Your message is: "+ message;
	}
	
	@PostMapping(path = "users")
	public User saveUser(@RequestBody User user) {
		System.out.println("User saved");
		user.setPassword("KaanG_23");
		return user;
	}

}
