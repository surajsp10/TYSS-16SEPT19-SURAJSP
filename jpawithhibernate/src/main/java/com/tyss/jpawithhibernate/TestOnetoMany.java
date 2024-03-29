package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.onetomany.Pencil;
import com.tyss.jpahibernate.onetomany.PencilBox;

public class TestOnetoMany {
	public static void main(String[] args) {
		
		
		PencilBox pBox = new PencilBox();
		pBox.setBid(1);
		pBox.setBname("Apsara");
		
		Pencil pBox1 = new Pencil();
		pBox1.setPid(111);
		pBox1.setColor("Black");
		pBox1.setPencilBox(pBox);
		
		
		Pencil pBox2 = new Pencil();
		pBox2.setPid(122);
		pBox2.setColor("white");
		pBox2.setPencilBox(pBox);
		
		
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		try {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		
		entitymanager.persist(pBox1);
		entitymanager.persist(pBox2);
		
		entitytransaction.commit();
		System.out.println("Record Saved");
	
		
		
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			entitytransaction.rollback();
		}
		
	}
	}


