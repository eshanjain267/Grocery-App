package com.app.groceries.groceries_seller.service;

import com.app.groceries.groceries_seller.dto.UserCredentialDto;
import com.app.groceries.groceries_seller.entity.Shop_credential_tbl;

public interface ISeller_Service {
	Shop_credential_tbl doRegister(Shop_credential_tbl user);
	Shop_credential_tbl doLogin(UserCredentialDto user);
	
}
