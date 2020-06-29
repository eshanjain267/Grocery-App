package com.app.groceries.groceries_seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.groceries.groceries_seller.entity.Brand_tbl;
import com.app.groceries.groceries_seller.entity.Category_tbl;
import com.app.groceries.groceries_seller.service.ISellerProduct_Service;


@RestController
public class SellerProduct_controller {

		ISellerProduct_Service sellerproduct_service;


		@RequestMapping(path="/test", method = RequestMethod.GET)
		public String test() {
			return "working";
		}
		
		@Autowired
		public void setSellerproduct_service(ISellerProduct_Service sellerproduct_service) {
			this.sellerproduct_service = sellerproduct_service;
		}
		
		@GetMapping("/brands")
		public ResponseEntity<List<Brand_tbl>> getAllBrand() {
			return new ResponseEntity<List<Brand_tbl>>(sellerproduct_service.getBrand(), HttpStatus.OK);
		}
		
		@GetMapping("/categories")
		public ResponseEntity<List<Category_tbl>> getAllCategory() {
			return new ResponseEntity<List<Category_tbl>>(sellerproduct_service.getCategory(), HttpStatus.OK);
		}
		
}
