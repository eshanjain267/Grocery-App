package com.app.groceries.groceries_admin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "brand_tbl")
public class Brand_tbl {
	    @Id
	 	private Integer id;
	    private String brand_name;
	    
	    @OneToMany(
	            cascade = CascadeType.ALL,
	            orphanRemoval = true,
	            mappedBy="brand"
	        )
	        private List<Product_record_tbl> pdt = new ArrayList<>();
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getBrand_name() {
			return brand_name;
		}
		public void setBrand_name(String brand_name) {
			this.brand_name = brand_name;
		}
		
		@Override
		public String toString() {
			return "Brand_tbl [id=" + id + ", brand_name=" + brand_name + "]";
		}
	    	    
}
