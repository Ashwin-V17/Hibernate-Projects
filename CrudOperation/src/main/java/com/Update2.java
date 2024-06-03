package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User u=em.find(User.class, 17);
		
		if(u!=null) {
			
			u.setAge(22);
			et.begin();
			em.merge(u);
			et.commit();
			
			System.out.println("Data Updated");
			
	}else {
		System.out.println("ID not Found");
	}

	}
}
