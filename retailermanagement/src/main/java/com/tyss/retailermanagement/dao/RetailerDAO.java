package com.tyss.retailermanagement.dao;

import com.tyss.retailermanagement.dto.ProductBean;
import com.tyss.retailermanagement.dto.RetailerBean;

public interface RetailerDAO {

	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
	public boolean changePassword(int id, String password);
	public ProductBean searchProduct(int id);
}
