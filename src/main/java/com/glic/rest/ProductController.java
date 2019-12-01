package com.glic.rest;







import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getProducts")
public class ProductController {
	
	@Autowired
	
	ProductService productService;
	
	@PostMapping("/all")
	public ProductModel getAllProducts(@RequestBody ProductModel productmodel)
	{
		return productService.createNewProduct(productmodel);
	}
	
	@GetMapping("/products")
	public List<ProductModel> getProducts(){
		return productService.getAllProducts();

	}
	
	
}

