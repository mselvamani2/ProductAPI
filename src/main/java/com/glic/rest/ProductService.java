package com.glic.rest;
import java.util.ArrayList;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
	
	private List<ProductModel> pm=new ArrayList<>();
	
	
	public ProductModel createNewProduct(@RequestBody ProductModel productmodel)
	{
		pm.add(productmodel);
		return productmodel;
	}
	
	
	public List<ProductModel> getAllProducts(){
		
		return pm;
		
	}
	
	
	public ProductModel getOneProduct(@PathVariable("id") String productId)
	{
		for(ProductModel pmodel:pm)
		{
			if(pmodel.getId()==productId)
			{
				return pmodel;
			}
		}
		return null;
	}
	
}
