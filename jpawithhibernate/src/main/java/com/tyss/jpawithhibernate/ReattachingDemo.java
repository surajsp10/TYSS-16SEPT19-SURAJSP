package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {
		
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		
		try {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
				entitytransaction = entitymanager.getTransaction();
				entitytransaction.begin();
				
				
				
				Product productinfo = entitymanager.find(Product.class, 101);
				
				//to check whether it contains the object
				System.out.println(entitymanager.contains(productinfo));
				
				//to detach
				entitymanager.detach(productinfo);
				
				//to check whether it executes the changes
//				productinfo.setQuantity(1000);
				//to again reattach the connection
				Product productinfo2 = entitymanager.merge(productinfo);
				productinfo2.setPname("TV");
				System.out.println("Updated record");
				entitytransaction.commit();
				
		}catch (Exception e) {

			e.printStackTrace();
			entitytransaction.rollback();
			
		}	
				entitymanager.close();
	}//end of main method
	
}//end of reattachinDemo
