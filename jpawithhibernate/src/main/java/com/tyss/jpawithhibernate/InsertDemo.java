package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		
		Product productInfo = new Product();
		productInfo.setPid(103);
		productInfo.setPname("Pan");
		productInfo.setQuantity(20);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
		//persistence is a bootstrap class;;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		//
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		
		//
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Record Saved");
		entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();//costly resource
		
	}
}
