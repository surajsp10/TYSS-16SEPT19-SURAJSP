package com.tyss.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.manytomany.Course;
import com.tyss.jpahibernate.manytomany.Student;

public class TestManyToMany {

	
	public static void main(String[] args) {
		
		
		
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("Java");
		
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("JDBC");
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("SQL");
		
		ArrayList<Course> a = new ArrayList<Course>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		
		Student abc = new Student();
		abc.setSid(100);
		abc.setSname("Suraj");
		abc.setCourse(a);
		
		EntityTransaction entitytransaction = null;
		EntityManager entitymanager = null;
		
//		Student student1 = new Student();
//		student1.setSid(101);
//		student1.setSname("Suraj");
//		student1.setCourse(a);
		
		try {
			
			EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			
			entitymanager.persist(abc);
//			entitymanager.persist(student1);
			
			entitytransaction.commit();
			System.out.println("Record Saved");
		
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
		
		}
		entitymanager.close();
	}
}
