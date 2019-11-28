package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertUsingJPQL {

	
	public static void main(String[] args) {
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		
		
		try {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
//		String jpql = "insert into Product (pid,pname,quantity)values (pid:id,pname:name,quantity:quantity)";
		
		String jpql = "insert into Product (pid,pname,quantity) values(109,'book',10)";
		
		Query query = entitymanager.createNativeQuery(jpql);
//		query.setParameter("id", 102);
//		query.setParameter("name","Laptop");
//		query.setParameter("quantity", 10);
		int res = query.executeUpdate();
		System.out.println(res);
		entitytransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			
			
			e.printStackTrace();
			entitytransaction.rollback();
		}finally {
			entitymanager.close();	
		}
	}
}
