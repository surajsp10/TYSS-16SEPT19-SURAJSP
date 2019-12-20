package com.tyss.StockManagement.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderHistory {

	
	@Id
	@Column
	private int order_id;
	
	@Autowired
	@Column
	private int id;
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
