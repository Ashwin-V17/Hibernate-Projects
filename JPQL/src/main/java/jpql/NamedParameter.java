package jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedParameter {
 static	Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Name");
		String name=scr.nextLine();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c from Csk c where c.player_Name=:name");
		q.setParameter("name", name);
		List<Csk> li=q.getResultList();
		System.out.println(li);
	}

}
