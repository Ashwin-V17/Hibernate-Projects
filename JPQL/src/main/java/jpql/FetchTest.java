package jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchTest {

	 static	Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(" like");
		String like=scr.nextLine();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c.player_Name from Csk c where ename like '%?1%' ");
		q.setParameter(1,like );
		List<Csk> li=q.getResultList();
		System.out.println(li);
	
	}
}


