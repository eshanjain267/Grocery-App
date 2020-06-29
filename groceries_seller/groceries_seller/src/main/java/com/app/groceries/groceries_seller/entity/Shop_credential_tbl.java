package com.app.groceries.groceries_seller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "shop_credential_tbl")
public class Shop_credential_tbl {
	
	// when shop get registered then some information needs to be inserted in shop_tbl
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String user_name;
    private String password;
    private String security_key;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurity_key() {
		return security_key;
	}
	public void setSecurity_key(String security_key) {
		this.security_key = security_key;
	}
	
	
}
