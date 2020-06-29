package com.app.groceries.groceries_admin.service;

import java.util.List;

import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.entity.Product_record_tbl;

public interface ProductService {

	public Output getProductsByCategoryId(Integer CategoryId);
	public Output getProductsByBrandId(Integer brandId);
	public Output getProductByProductId(String ProductId);
    public Output getAllProducts();
	public Product_record_tbl addProduct(Product_record_tbl product);
	public Output getProductByProductId(List<String> Ids);
	
}
