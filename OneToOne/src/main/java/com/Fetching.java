package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetching {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		System.out.println("Enter a ID");
		
		Person per=em.find(Person.class,scr.nextInt() );
		
		System.out.println(per);
	}
	
	
}
