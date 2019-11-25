package com.testyantra.assessment.util;

import com.testyantra.assessment.dao.MobileDAO;
import com.testyantra.assessment.dao.MobileDAOImpl;

public class Mobile {

	
public static MobileDAO getMobileDAO() {
		
		
		return new MobileDAOImpl();
	}
}
