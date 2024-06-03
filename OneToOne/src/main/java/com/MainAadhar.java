package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class MainAadhar {
//	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard a=new AadharCard();
		a.setAdno(9123456765l);
		a.setDob("28/07/2002");
		a.setAddress("Chennai");
		a.setMobile(9998877665l);
	
		Person p =new Person();
		p.setGender("Male");
		p.setName("kabi");
		p.setCard(a);
		
		try {
			et.begin();
			em.persist(p);
			et.commit();
			
			System.out.println("Data Inserted Succesfully");
			
		}catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}

}
