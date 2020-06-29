package com.app.groceries.groceries_admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String name ;
	public long getId() {
		return id;
	}
	protected Test() {}
	public Test(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
