package jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertCrics {
	static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		Csk c=new Csk();
		System.out.println("Enter Jersey No");
		c.setJerseyNo(scr.nextInt());
		System.out.println("Enter  Age");
		c.setAge(scr.nextInt());
		scr.nextLine();
		System.out.println("Enter  Name");
		c.setPlayer_Name(scr.nextLine());
		System.out.println("Enter Role");
		c.setRole(scr.nextLine());
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(c);
		et.commit();
		
		System.out.println("Data Inserted");
		
		
	}

}
