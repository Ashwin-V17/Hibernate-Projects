package jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByName {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a Name :");
		String name=scr.nextLine();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query  q=em.createQuery("Select c from Csk c where c.player_Name=?1");
		q.setParameter(1, name);
		
		List <Csk> li =q.getResultList();
		System.out.println(li);
		scr.close();
		
	
	}

}
