package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main_User {
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {	
		User u =new User();
		System.out.println("Enter User Id");
		u.setUid(scr.nextInt());
		System.out.println("Enter User Name");
		u.setUser_name(scr.next());
		System.out.println("Enter User Age");
		u.setAge(scr.nextInt());
		System.out.println("Enter User Gender");
		u.setGender(scr.next());
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(u);
		et.commit();
		
		System.out.println("Data Inserted");
		
	
	}

}
