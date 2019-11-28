package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.dto.Product;

public class ReadDemo {



	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 101);

		System.out.println("Id---"+productDetail.getPid());
		System.out.println("Name---"+productDetail.getPname());
		System.out.println("Quantity---"+productDetail.getQuantity());

		entityManager.close();
	}//end of main
}//end of ReadDemo class
