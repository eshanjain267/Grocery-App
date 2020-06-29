package com.app.groceries.groceries_seller.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Shop_tbl;

public interface Brand_tbl_dao extends JpaRepository<Brand_tbl, Integer >{
	
}
