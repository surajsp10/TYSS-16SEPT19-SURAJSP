package com.tyss.StockManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.StockManagement.dao.StockManagementDAO;
import com.tyss.StockManagement.dto.Products;
@Service
public class StockServiceImpl implements StockService {

	
	
	@Autowired
	StockManagementDAO dao;
	
	@Override
	public boolean addProduct(Products product) {
		// TODO Auto-generated method stub
		
				dao.addProduct(product);
				return true;
	}

	@Override
	public boolean updateProduct(Products product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Products getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Products getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
