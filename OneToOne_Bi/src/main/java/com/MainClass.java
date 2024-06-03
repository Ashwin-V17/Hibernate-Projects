package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		AadharCard a=new AadharCard();
		a.setAddress("Chennai");
		a.setAdno(18293278939l);
		a.setDob("23/12/2001");
		a.setMobile(9087654321l);
		
		Person p =new Person();
		p.setName("Tamilarasan");
		p.setGender("Male");
		p.setCard(a);
		
		a.setP(p);
		try {
			et.begin();
			em.persist(p);
			em.persist(a);
			et.commit();
			System.out.println("Data Inserted Succesfully");
			
		}catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}

		
		
	}

}
