package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Update {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter a ID");
		Passengers p=em.find(Passengers.class,scr.nextInt() );
		
		if(p!=null) {
			System.out.println("Enter a Name");
			p.setName(scr.next());
			et.begin();
			em.merge(p);
			et.commit();
			
			System.out.println("Data Updated");
			
	}else {
		System.out.println("ID not Found");
	}




	}

}
