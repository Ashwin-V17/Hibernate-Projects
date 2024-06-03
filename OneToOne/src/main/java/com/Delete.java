package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	static Scanner scr= new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("Enter a ID ");
		Person p =em.find(Person.class, scr.nextInt());
		AadharCard a= p.getCard();
		
		try {
			et.begin();
			em.remove(p);
			em.remove(a);
			et.commit();
			
			System.out.println("Data Deleted Succesfully");
			scr.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}	}

}
