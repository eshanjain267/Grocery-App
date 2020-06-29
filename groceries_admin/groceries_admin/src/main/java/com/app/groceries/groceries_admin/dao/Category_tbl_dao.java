package com.app.groceries.groceries_admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.groceries.groceries_admin.entity.Category_tbl;

public interface Category_tbl_dao extends JpaRepository<Category_tbl,Integer> {

}
