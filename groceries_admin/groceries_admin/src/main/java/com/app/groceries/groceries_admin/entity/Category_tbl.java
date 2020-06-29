package com.app.groceries.groceries_admin.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Reference;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name ="category_tbl")
public class Category_tbl {
	
	public Category_tbl() {
		super();
	}
	@Id 
	private Integer id;
	private String category_name;
	
	
	 @OneToMany(
	            orphanRemoval = true,
	            mappedBy="category"
	        )
	    private List<Product_record_tbl> products = new ArrayList<>();
	
	
	



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	@Override
	public String toString() {
		return "Category_tbl [id=" + id + ", category_name=" + category_name + ", products=" + products + "]";
	}


	


	
	
	
}
