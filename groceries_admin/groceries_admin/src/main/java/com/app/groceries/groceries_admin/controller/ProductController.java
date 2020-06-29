package com.app.groceries.groceries_admin.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.app.groceries.groceries_admin.customException.NoRecordFoundException;
import com.app.groceries.groceries_admin.dto.Output;
import com.app.groceries.groceries_admin.entity.Product_record_tbl;
import com.app.groceries.groceries_admin.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	 @GetMapping("/brand/{id}/products") 
	 public Output getProductsByBrandId(@PathVariable(value ="id") Integer brandid)
	 { 
		 try {
		  Output products =
	     productService.getProductsByBrandId(brandid);
		  return products ;
		 }
		 catch(Exception ex)
		 {
			 throw new ResponseStatusException(
			           HttpStatus.NOT_FOUND, "Not Found", ex);  
		 }
		
	 }
	 @GetMapping("/category/{id}/products") 
	 public Output getProductsByCategoryId(@PathVariable(value ="id") Integer categoryId)
	 {
		 try {
		 Output products =
	     productService.getProductsByCategoryId(categoryId);
		 if(products==null || products.getList().size()==0)
			 throw new Exception();
		 return products;
		 }
		 catch(Exception ex)
		 {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Not Found");
		 }
		
	 }
	 @GetMapping("/product/{id}") 
	public Output getProductsByProductId(@PathVariable(value ="id") String productId) throws ResponseStatusException
	 {
		 try {
		 Output products =
	     productService.getProductByProductId(productId);
		if(products.getList().get(0)==null)
			  throw new Exception() ;
		 return products ;
		 }
		 catch(Exception ex)
		 {
			 throw new ResponseStatusException(
			           HttpStatus.NOT_FOUND, "No data found for you",ex);  
		 }
	 }
		
		 
	 
	 @GetMapping("/products") 
	 public Output getAllProducts()
	 {
		 try {
		 Output products =
	     productService.getAllProducts();
		 return products ;
		 }
		 catch(Exception ex)
		 {
			 throw new ResponseStatusException(
			           HttpStatus.NOT_FOUND, "Not Found", ex); 
		 }
		
	 }
	 
	
    @PostMapping("/addproduct")
    public @Valid Product_record_tbl addToProduct_Record_tbl(@Valid @RequestBody Product_record_tbl product) {
        try {
        return productService.addProduct(product);
        }
        catch(Exception ex )
		 {
			 throw new ResponseStatusException( HttpStatus.NOT_ACCEPTABLE,"Check Data");  
		 }
    }
    @PostMapping("/products")
    public @Valid Output getProductByProductId(@Valid @RequestBody List<String> productIds)
    {
    	System.out.println(productIds);
    	 try {
    	       Output out = productService.getProductByProductId(productIds);
    	       return out;
    	        }
    	  catch(Exception ex )
    	{
    	 throw new ResponseStatusException( HttpStatus.NOT_ACCEPTABLE,"Check Data");  
    	}
    	
    }

  
	
}
