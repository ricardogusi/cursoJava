package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 5);
		usuario.setNome("Beatriz");
		usuario.setEmail("bia@hotmail.com");

		// em.merge(usuario);
		// Mesmo com o merge comentado ele funciona pois o objeto é gerenciado

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
