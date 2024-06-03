package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetching {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Train t=em.find(Train.class, 264208);
		System.out.println(t);
		Passengers p=em.find(Passengers.class, 1);
		System.out.println(p);
		}

}
