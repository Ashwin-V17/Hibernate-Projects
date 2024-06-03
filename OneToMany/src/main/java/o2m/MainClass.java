package o2m;

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
		
		Users u1=new Users();
		u1.setUserName("Ashwin");
		u1.setEmail("ashwinv0017@gmail.com");
		u1.setAge(21);
		u1.setGender("Male");
		u1.setMobile(9003272385l);
		u1.setPassword("ash007");
		
		Users u2=new Users();
		u2.setUserName("Kabilan");
		u2.setEmail("kabilan@gmail.com");
		u2.setAge(22);
		u2.setGender("Male");
		u2.setMobile(9087605321l);
		u2.setPassword("war123");
		
		ArrayList <Users> li=new ArrayList<Users>();
		li.add(u1);
		li.add(u2);
		
		Application app=new Application();
		app.setAppName("X");
		app.setRating(4.2);
		app.setVersion("2.3.07x");
		app.setSize("124mb");
		app.setUsers(li);
		
		try {
			et.begin();
			em.persist(app);
			em.persist(u1);
			em.persist(u2);
			et.commit();
			System.out.println("Data Saved Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}

}
