package com.tyss.retailermanagement.service;

import com.tyss.retailermanagement.dto.ProductBean;
import com.tyss.retailermanagement.dto.RetailerBean;

public interface RetailerService {
	
	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
	public ProductBean searchProduct(int id);
	public boolean changePassword(int id, String password);

}
