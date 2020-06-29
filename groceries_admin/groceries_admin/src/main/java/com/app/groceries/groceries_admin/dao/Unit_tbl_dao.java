package com.app.groceries.groceries_admin.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.entity.Unit_tbl;

public interface Unit_tbl_dao extends JpaRepository<Unit_tbl,Integer> {
  
}
