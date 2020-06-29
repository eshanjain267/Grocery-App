package com.app.groceries.groceries_seller.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.groceries.groceries_seller.entity.Shop_credential_tbl;

public interface Shop_credential_tbl_dao extends JpaRepository<Shop_credential_tbl, Integer >{
	
	@Query("SELECT t FROM Shop_credential_tbl t where t.user_name = :name") 
	Optional<Shop_credential_tbl> findByUserName(@Param("name") String user_name);
}
