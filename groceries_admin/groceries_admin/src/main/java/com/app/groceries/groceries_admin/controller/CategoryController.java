package com.app.groceries.groceries_admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping("/category")
	public Output getAll()
	{
		Output category = categoryService.getAll();
		return category ;
	}
}
