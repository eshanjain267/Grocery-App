package com.app.groceries.groceries_admin.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AdminController {

	@GetMapping
	public String test() {
		return "working";
	}
	
	
	



}

