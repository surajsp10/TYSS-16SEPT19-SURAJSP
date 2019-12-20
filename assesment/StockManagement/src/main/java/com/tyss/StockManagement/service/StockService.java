package com.tyss.StockManagement.service;

import java.util.List;



import com.tyss.StockManagement.dto.Products;

public interface StockService {

	
	public boolean addProduct(Products product);
	
	public boolean updateProduct(Products product);
	
	public boolean deleteProductById(int id);
	
	public boolean deleteProductByName(String name);
	
	public boolean deleteProductByCategory(String category);
	
	public Products getProductById(int id);
	
	public Products getProductByName(String name);
	
	public List<Products> getProductByCategory(String category);
	
	public List<Products> getAllProduct();
}
