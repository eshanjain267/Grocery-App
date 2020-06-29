package com.app.groceries.groceries_seller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.groceries.groceries_seller.entity.Shop_tbl;

@Repository
public interface Shop_tbl_dao extends JpaRepository<Shop_tbl, Integer >{

}
