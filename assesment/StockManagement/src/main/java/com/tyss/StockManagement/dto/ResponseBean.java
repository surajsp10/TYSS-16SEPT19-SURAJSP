package com.tyss.StockManagement.dto;

import java.util.List;


public class ResponseBean {
	
	private int statusCode;
	private String message;
	private List<Products> assets;
	
	public List<Products> getAssets() {
		return assets;
	}

	public void setAssets(List<Products> assets) {
		this.assets = assets;
	}

	private String desc;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
