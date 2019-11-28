package com.tyss.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {


	public String name;
	public String penname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPenname() {
		return penname;
	}
	public void setPenname(String penname) {
		this.penname = penname;
	}
	
	
}
