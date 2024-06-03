package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchUserById {
//	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em1=emf.createEntityManager();
		EntityManager em2=emf.createEntityManager();
		EntityManager em3=emf.createEntityManager();
//		System.out.println("Enter Primary Key ");
		User u=em1.find(User.class, 1);
		User u1=em1.find(User.class, 1);
		User u2=em2.find(User.class, 1);
		User u3=em2.find(User.class, 1);
		System.out.println(u);

	}

}
