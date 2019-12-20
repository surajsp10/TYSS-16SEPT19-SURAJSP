package com.tyss.StockManagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="order_info")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(unique = true)
	private int id;
	
	@Column
	private double totalprice;
	@Column
	private double totalprice_withgst;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public double getTotalprice_withgst() {
		return totalprice_withgst;
	}
	public void setTotalprice_withgst(double totalprice_withgst) {
		this.totalprice_withgst = totalprice_withgst;
	}
	

	

}
