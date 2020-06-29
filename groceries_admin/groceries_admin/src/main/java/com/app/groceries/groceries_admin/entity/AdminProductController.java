package com.app.groceries.groceries_admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AdminProductController {
	@Id
	private Integer id;
	private String product_id;
	
	private int Admin_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}

}
