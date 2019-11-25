package com.testyantra.assessment.dao;

import java.util.List;

import com.testyantra.assessment.dto.ContactBean;

public interface MobileDAO {

	public ContactBean selectContact(String name);
	//public int insertContact();
	public int updateContact();
	
	public List<ContactBean> getAllContacts(String name);
	public ContactBean searchContact(String name);
//	public List<ContactBean> insertContact(int number, String name, String groupp);
	public ContactBean insertContact(String string, String name, String groupp);
	
	public int deleteContact();
}
