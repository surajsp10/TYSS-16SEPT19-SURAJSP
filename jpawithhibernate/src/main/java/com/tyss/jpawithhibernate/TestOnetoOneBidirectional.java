package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpahibernate.onetoone.Person;
import com.tyss.jpahibernate.onetoone.VoterCard;

public class TestOnetoOneBidirectional {
	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(1);
		vc.setVname("suraj");
		
		Person p = new Person();
		p.setPid(1);
		p.setName("suraj");
		p.setVoterCard(vc);
		
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;
		try {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("Test");
		entitymanager = entitymanagerfactory.createEntityManager();
		entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		
		//code for two way
		VoterCard vCard = entitymanager.find(VoterCard.class,1);
		System.out.println(vCard.getPerson().getPid());
		
		//entitymanager.persist(p);
		entitytransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			entitytransaction.rollback();
		}
		
	}

}
