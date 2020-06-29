package com.app.groceries.groceries_admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.groceries.groceries_admin.dao.Category_tbl_dao;
import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.entity.Category_tbl;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private Category_tbl_dao category_tbl_dao ;
	
	
	@Override
	public Output getCategoryById(Integer id) {
		Output out = new Output();
		ArrayList<Category_tbl> list = new ArrayList<>(); 
		list.add(category_tbl_dao.findById(id).get());
		out.setList(list);
		return out ;
	}


	@Override
	public Output getAll() {
		Output out = new Output();
		ArrayList<Category_tbl> list = new ArrayList<>(); 
		out.setList(category_tbl_dao.findAll());
		//out.setList(list);
		return out ;
	}

}
