package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteById {

	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			System.out.println("Enter Primary Key ");
			User u=em.find(User.class, scr.nextInt());
			
			if(u!=null) {
				et.begin();
				em.persist(u);
				et.commit();
				
				System.out.println("Data Deleted");
			}else {
				System.out.println("ID not Found");
			}
	}

}
