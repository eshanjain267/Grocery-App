package com.app.groceries.groceries_seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop_tbl")
public class Shop_tbl {


	@Id 
	Integer id;  // same as of  credential table
    
	private String name;
	private String address1;
	private String address2;
	private String state;
	private String city;
	private String locality;
	private String owner_name;
	private String contact_no;
	private Boolean is_varified;
	public Shop_tbl() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	public Shop_tbl(Integer id, String name, String address1, String address2, String state, String city,
			String locality, String owner_name, String contact_no, Boolean is_varified) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.city = city;
		this.locality = locality;
		this.owner_name = owner_name;
		this.contact_no = contact_no;
		this.is_varified = is_varified;
	}
	
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public Boolean getIs_varified() {
		return is_varified;
	}
	public void setIs_varified(Boolean is_varified) {
		this.is_varified = is_varified;
	}
	
	
	
	
}
