package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.dto.Product;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		EntityTransaction entitytransaction = null;
		EntityManager entitymanager = null;
		
		
		try {
			
			
			EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Table");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			
			
			Product productinfo = entitymanager.find(Product.class, 102);
			 entitymanager.remove(productinfo);
			 System.out.println("Record remove");
			 entitytransaction.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entitytransaction.rollback();
		}
		
		entitymanager.close();
	}

}
