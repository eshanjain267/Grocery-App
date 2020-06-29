package com.app.groceries.groceries_seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category_tbl")
public class Category_tbl {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String category_name;
    
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
    
    
}
