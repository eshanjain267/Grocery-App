package com.app.groceries.groceries_admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.groceries.groceries_admin.entity.Product_record_tbl;

public interface Product_record_tbl_dao extends JpaRepository<Product_record_tbl,Integer> {
	
	@Query("SELECT p FROM Product_record_tbl  p WHERE p.isAdded=1 AND p.isDeleted=0 AND p.brand=(SELECT b FROM Brand_tbl b WHERE b.id=(:id))")
	public List<Product_record_tbl> findProductsByBrandId(@Param("id")Integer id);
	
	@Query("SELECT p FROM Product_record_tbl  p WHERE p.isAdded=1 AND p.isDeleted=0 AND p.category=(SELECT c FROM Category_tbl c WHERE c.id=(:id))")
	public List<Product_record_tbl> findProductsByCategoryId(@Param("id")Integer id);
	
	@Query("SELECT p FROM Product_record_tbl  p WHERE p.isAdded=1 AND p.isDeleted=0 AND p.product_id=(:id)")
	public Product_record_tbl findProductByProductId(@Param("id")String id);
	
	public List<Product_record_tbl> findAll();
	
	public Product_record_tbl save(Product_record_tbl product);
	
		
}
