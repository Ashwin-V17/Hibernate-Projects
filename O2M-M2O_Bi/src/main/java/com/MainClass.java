package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Staff st=new Staff();
		st.setName("Surya");
		st.setAge(25);
		st.setPhone(9876054321l);
		
		Student s1=new Student();
		s1.setName("Ashwin");
		s1.setMarks(98);
		s1.setPhone(9003272385l);
		s1.setAge(21);
		s1.setSt(st);
		
		Student s2=new Student();
		s2.setName("kathir");
		s2.setMarks(100);
		s2.setPhone(8073276385l);
		s2.setAge(20);
		s2.setSt(st);
		
		List<Student> ls=new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		
		st.setS(ls);
		try {
			et.begin();
			em.persist(st);
			em.persist(s1);
			em.persist(s2);
			et.commit();
			System.out.println("Data Inserted");
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}
}
