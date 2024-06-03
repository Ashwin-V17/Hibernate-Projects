package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchNameAndAge {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select c.player_Name,c.age from Csk c");
		List<Object []> l =q.getResultList();
		for(Object [] o: l) {
			System.out.println("Player Name : "+o[0] +" |   Age : "+o[1] );
		}
	}

}
