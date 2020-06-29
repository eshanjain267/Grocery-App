package com.app.groceries.groceries_seller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.groceries.groceries_seller.entity.Category_tbl;

@Repository
public interface Category_tbl_dao extends JpaRepository<Category_tbl, Integer >{
	
}
