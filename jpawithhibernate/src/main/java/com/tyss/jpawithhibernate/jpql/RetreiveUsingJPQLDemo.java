package com.tyss.jpawithhibernate.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpahibernate.dto.Product;

public class RetreiveUsingJPQLDemo {

	public static void main(String[] args) {
		EntityManager entitymanager = null;
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
		String jpql = "from Product";
		Query query = entitymanager.createQuery(jpql);
		List <Product> query1 = query.getResultList();
		for(Product product:query1) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
		}
	}
	
}
