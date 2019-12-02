package com.tyss.retailermanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
@Table(name = "order")
public class OrderBean {

	
	@Id
	@Column
	@GeneratedValue
	private int orderid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productid",nullable = false)
	private List<ProductBean> productBean;
	public List<ProductBean> getProductBean() {
		return productBean;
	}
	public void setProductBean(List<ProductBean> productBean) {
		this.productBean = productBean;
	}
	public List<RetailerBean> getRetailerBean() {
		return retailerBean;
	}
	public void setRetailerBean(List<RetailerBean> retailerBean) {
		this.retailerBean = retailerBean;
	}
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id",nullable = false)
	private List<RetailerBean> retailerBean;
	@Column
	private int productquantity;
	@Column
	private int Amount;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	
}
