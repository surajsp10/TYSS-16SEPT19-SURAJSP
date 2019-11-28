package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.dto.Product;

public class UpdateDemo {

	
	public static void main(String[] args) {
		
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Product productInfo = entityManager.find(Product.class, 101);
			productInfo.setPname("mobile");
			System.out.println("Updated Record");
			entityTransaction.commit();
		}catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
		
		entityManager.close();
			
			
		
	}
}
