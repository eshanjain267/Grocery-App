package com.app.groceries.groceries_admin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="unit_tbl")
public class Unit_tbl {
	
	@Id
	private Integer id ;
	private String name ;
	
	 @OneToMany(
	           mappedBy="unit",
	            orphanRemoval = true
	        )
	        private List<Product_record_tbl> pdt = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Unit_tbl [id=" + id + ", name=" + name + "]";
	}
	

}
