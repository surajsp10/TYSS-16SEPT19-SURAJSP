package com.tyss.retailermanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductBean {
	
	
	@Id
	@Column
	@GeneratedValue
	private int productid;
	@Column
	private String productname;
	@Column
	private int ppu;
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPpu() {
		return ppu;
	}
	public void setPpu(int ppu) {
		this.ppu = ppu;
	}


}
