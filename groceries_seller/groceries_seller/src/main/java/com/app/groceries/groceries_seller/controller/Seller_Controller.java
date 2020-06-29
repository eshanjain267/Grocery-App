package com.app.groceries.groceries_seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.groceries.groceries_seller.dto.UserCredentialDto;
import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Shop_credential_tbl;
import com.app.groceries.groceries_seller.service.ISeller_Service;

import net.bytebuddy.asm.Advice.This;

@RestController
public class Seller_Controller {


	ISeller_Service seller_service;
	@Autowired
	public void setSeller_service(ISeller_Service seller_service) {
		this.seller_service = seller_service;
	}
	
	
	
	// -------------CODE--------------------
	@GetMapping
	public String test() {
		return "working";
	}

	



	@PostMapping("/register")
	public ResponseEntity<Shop_credential_tbl> doRegister(@RequestBody Shop_credential_tbl user) {
		Shop_credential_tbl newUser = this.seller_service.doRegister(user);
		return new ResponseEntity<Shop_credential_tbl>(newUser, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Shop_credential_tbl> doLogin(@RequestBody UserCredentialDto userdto) {
		return new ResponseEntity<Shop_credential_tbl>(this.seller_service.doLogin(userdto),  HttpStatus.OK);
	}
}
