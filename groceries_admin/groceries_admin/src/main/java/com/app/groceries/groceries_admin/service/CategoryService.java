package com.app.groceries.groceries_admin.service;

import com.app.groceries.groceries_admin.dto.Output;

public interface CategoryService {
  
	public Output getCategoryById(Integer id);
	public Output getAll();
}
