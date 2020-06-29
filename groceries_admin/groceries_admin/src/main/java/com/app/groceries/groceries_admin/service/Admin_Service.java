
package com.app.groceries.groceries_admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.groceries.groceries_admin.dao.AdminProductController_dao;

@Service
public class Admin_Service implements IAdmin_Service{
	AdminProductController_dao admin_product_controller_dao;

	
	@Autowired
	public void setAdmin_product_controller_dao(AdminProductController_dao admin_product_controller_dao) {
		this.admin_product_controller_dao = admin_product_controller_dao;
	}
	
	
}

