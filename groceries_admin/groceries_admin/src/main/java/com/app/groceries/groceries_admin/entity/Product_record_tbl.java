package com.app.groceries.groceries_admin.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "product_record_tbl")
public class Product_record_tbl  {
	
	public Product_record_tbl() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String product_id;
	private int itemId;
	
	 @ManyToOne(fetch = FetchType.LAZY )
	 @JoinColumn(referencedColumnName="id")
	 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    private Category_tbl category;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(referencedColumnName="id")
	 @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    private Brand_tbl brand;
	
	
	private String description;
	private String name;
	private int weight;
    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(referencedColumnName="id")
	private Unit_tbl unit;
    
	private boolean isAdded;
	private boolean isDeleted;
	
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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Category_tbl getCategory() {
		return category;
	}

	public void setCategory(Category_tbl category) {
		this.category = category;
	}

	public Brand_tbl getBrand() {
		return brand;
	}

	public void setBrand(Brand_tbl brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	public Unit_tbl getUnit() {
		return unit;
	}

	public void setUnit(Unit_tbl unit) {
		this.unit = unit;
	}

	public boolean isAdded() {
		return isAdded;
	}

	public void setAdded(boolean isAdded) {
		this.isAdded = isAdded;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Product_record_tbl [id=" + id + ", product_id=" + product_id + ", itemId=" + itemId + ", category="
				+ category + ", brand=" + brand + ", description=" + description + ", name=" + name + ", weight="
				+ weight + ", unit=" + unit + ", isAdded=" + isAdded + ", isDeleted=" + isDeleted + "]";
	}

	
	
	
	
	
	
}
