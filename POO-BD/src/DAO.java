import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;

public class DAO<E extends Identificavel> {
	
	

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("salao");
	
	public void save(E e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(E e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remove(E e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public E find(Class<E> classe,Long id) {
		EntityManager em = factory.createEntityManager();
		E e = em.find(classe, id);
		em.close();
		return e;
	}
	
}