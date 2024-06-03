package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter a ID ");
		Passengers p =em.find(Passengers.class, 2);
		Train a= p.getTrain();												
		
		try {
			et.begin();
			em.remove(p);
			em.remove(a);
			et.commit();
			
			System.out.println("Data Deleted Succesfully");
//			scr.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}	}

	}

																																		