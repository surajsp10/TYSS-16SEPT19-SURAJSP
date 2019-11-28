package com.tyss.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateUsingJPQLDemo {
	
	
	public static void main(String[] args) {
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		
		
		try {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		String jpql = "update Product set pname='watch' where pid=101";
		Query query = entitymanager.createQuery(jpql);
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
