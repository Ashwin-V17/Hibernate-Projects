package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		System.out.println(p);
		AadharCard a=em.find(AadharCard.class, 18293278939l);
		Person p1=a.getP();
		System.out.println(a);

		System.out.println(p1);
		
	}

}
