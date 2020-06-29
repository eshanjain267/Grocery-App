package com.app.groceries.groceries_admin.dto;

import java.util.List;

public class Output {

	List list ;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Output [list=" + list + "]";
	}

	
}
