package com.app.groceries.groceries_seller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.groceries.groceries_seller.dao.Brand_tbl_dao;
import com.app.groceries.groceries_seller.dao.Shop_credential_tbl_dao;
import com.app.groceries.groceries_seller.dao.Shop_tbl_dao;
import com.app.groceries.groceries_seller.dto.UserCredentialDto;
import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Shop_credential_tbl;
import com.app.groceries.groceries_seller.entity.Shop_tbl;

@Service
public class Seller_Service  implements ISeller_Service{
	
	Shop_tbl_dao shoptbldao;
	Brand_tbl_dao brandtbldao;
	Shop_credential_tbl_dao shopcredentialtbldao;
	@Autowired
	public void setShopcredentialtbldao(Shop_credential_tbl_dao shopcredentialtbldao) {
		this.shopcredentialtbldao = shopcredentialtbldao;
	}
	@Autowired
	public void setShoptbldao(Shop_tbl_dao shoptbldao) {
		this.shoptbldao = shoptbldao;
	}
	@Autowired
	public void setBrandtbldao(Brand_tbl_dao brandtbldao) {
		this.brandtbldao = brandtbldao;
	}
	
	//------------------------- CODE -------------------------------------
	@Override
	public Shop_credential_tbl doRegister(Shop_credential_tbl user) {
		// TODO Auto-generated method stub	
		
		    Shop_credential_tbl s = this.shopcredentialtbldao.saveAndFlush(user);
			this.shoptbldao.save(new Shop_tbl(s.getId(), "","","","","","", "","",false));
          return s;
	}
	@Override
	public Shop_credential_tbl doLogin(UserCredentialDto user) {
		// TODO Auto-generated method stub

		Optional<Shop_credential_tbl> fooOptional = this.shopcredentialtbldao.findByUserName(user.getUser_name());
		if (fooOptional.isPresent()){
			Shop_credential_tbl foo = fooOptional.get();
			return foo;
		}
		else{
		   // alternative processing....
		   return null;
		}
	}
	
	
	
	
}
