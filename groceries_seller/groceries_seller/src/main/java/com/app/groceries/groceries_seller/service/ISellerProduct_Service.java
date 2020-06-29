package com.app.groceries.groceries_seller.service;

import java.util.List;

import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Category_tbl;

public interface ISellerProduct_Service {
	List<Brand_tbl> getBrand();
	List<Category_tbl> getCategory();
	
}
