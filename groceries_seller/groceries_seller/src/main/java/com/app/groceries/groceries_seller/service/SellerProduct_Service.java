package com.app.groceries.groceries_seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.groceries.groceries_seller.dao.Brand_tbl_dao;
import com.app.groceries.groceries_seller.dao.Category_tbl_dao;
import com.app.groceries.groceries_seller.dao.Shop_tbl_dao;
import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Category_tbl;

@Service
public class SellerProduct_Service  implements ISellerProduct_Service {
	Shop_tbl_dao shoptbldao;
	Brand_tbl_dao brandtbldao;
    Category_tbl_dao categorytbldao;
    @Autowired
	public void setCategorytbldao(Category_tbl_dao categorytbldao) {
		this.categorytbldao = categorytbldao;
	}
	@Autowired
	public void setShoptbldao(Shop_tbl_dao shoptbldao) {
		this.shoptbldao = shoptbldao;
	}
	@Autowired
	public void setBrandtbldao(Brand_tbl_dao brandtbldao) {
		this.brandtbldao = brandtbldao;
	}
	
	// -------------- CODE ---------------------------------
	public List<Brand_tbl> getBrand() {
		return brandtbldao.findAll();
	}
	
	public List<Category_tbl> getCategory() {
		return categorytbldao.findAll();
	}
}
