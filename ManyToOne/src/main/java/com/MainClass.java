package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Train t=new Train();
		t.setTrainNo(264208);
		t.setName("Florida Express");
		t.setDeparture("Chennai");
		t.setArrival("Florida");
		t.setTicketCost(450);
		
		Passengers p=new Passengers();
		p.setName("Kabilan");
		p.setGender("Male");
		p.setAge(20);
		p.setLocation("Theni");
		p.setTrain(t);
		
		Passengers p1=new Passengers();
		p1.setName("Govind");
		p1.setGender("Not Decided Yet");
		p1.setAge(20);
		p1.setLocation("Florida");
		p1.setTrain(t);
		try {
			et.begin();
			em.persist(t);
			em.persist(p);
			em.persist(p1);
			et.commit();
			System.out.println("Data Saved SuccesFully");
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}

}
