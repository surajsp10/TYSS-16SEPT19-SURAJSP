package com.tyss.retailermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.retailermanagement.dao.RetailerDAO;
import com.tyss.retailermanagement.dto.ProductBean;
import com.tyss.retailermanagement.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{

	
	
	@Autowired
	private RetailerDAO dao;
	
	@Override
	public RetailerBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public int register(RetailerBean bean) {
		return dao.register(bean);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return changePassword(id, password);
	}

}
