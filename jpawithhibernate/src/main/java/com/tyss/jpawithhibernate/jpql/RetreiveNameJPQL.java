package com.tyss.jpawithhibernate.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpahibernate.dto.Product;

public class RetreiveNameJPQL {

	
	
		
		
		public static void main(String[] args) {
			EntityManager entitymanager = null;
			EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
			entitymanager = entitymanagerfactory.createEntityManager();
			String jpql = "select pname from Product";
			Query query = entitymanager.createQuery(jpql);
			List <String> query1 = query.getResultList();
			for(String product:query1) {
				
				System.out.println(product);
				
			}
	}
}
