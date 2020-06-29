package com.app.groceries.groceries_admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.groceries.groceries_admin.dao.Product_record_tbl_dao;
import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.entity.Product_record_tbl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
     
	@Autowired
	private Product_record_tbl_dao product_record_tbl_dao ;
	
	@Override
	public Output getProductsByCategoryId(Integer CategoryId) {
		Output out = new Output();
	   out.setList(product_record_tbl_dao.findProductsByCategoryId(CategoryId));
	    return out ;
	}

	@Override
	public Output getProductByProductId(String ProductId) {
		 Output out = new Output();
		 ArrayList<Product_record_tbl> al = new ArrayList<>() ;
		  al.add(product_record_tbl_dao.findProductByProductId(ProductId));
		   out.setList(al);
		   return out ;
	}

	@Override
	public Output getProductsByBrandId(Integer brandId) {
		Output out = new Output();
		out.setList(product_record_tbl_dao.findProductsByBrandId(brandId));
		   return out ;
	}

	@Override
	public Output getAllProducts() {
		Output out = new Output();
		out.setList(product_record_tbl_dao.findAll());
		return out;
	}

	@Override
	public Product_record_tbl addProduct(Product_record_tbl product) {

		return product_record_tbl_dao.save(product);
	}
    
	@Override
	public Output getProductByProductId(List<String> ProductIds)
	{
		Output out = new Output();
		 ArrayList<Product_record_tbl> list = new ArrayList<>() ;
		 for(String id :ProductIds)
		 {
			 list.add(product_record_tbl_dao.findProductByProductId(id));
		 }
		out.setList(list);
		return out ;
	}
	

}



