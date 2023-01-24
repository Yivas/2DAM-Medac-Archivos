package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Creo una clase que implemente la interfaz para realizar las operaciones
// CRUD y algunas más para el ejercicio

public class Metodos implements Ejercicio9Interfaz {

	// Creo una variable de tipo EntityManagerFactory
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/biblioteca_manga.odb");

	// Creo un método para añadir mangas a la base de datos
	@Override
	public void createManga(Manga manga) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo la transacción
			em.getTransaction().begin();
			// Guardo el objeto en la base de datos
			em.persist(manga);
			// Realizo el commit de la transacción
			em.getTransaction().commit();
			// Cierro la conexión
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}
	}

	// Leer un manga
	@Override
	public Manga readManga(int id) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo un objeto de tipo Manga
		Manga manga = null;
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo de la transacción
			em.getTransaction().begin();
			// Leo el objeto de la base de datos
			manga = em.find(Manga.class, id);
			// Realizo el commit de la transacción
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}
		// Devuelvo el objeto
		return manga;

	}

	@Override
	public void updateManga(Manga manga) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		try {
			// Comienza de la transacción
			em.getTransaction().begin();
			// Actualizo el objeto en la base de datos
			em.merge(manga);
			// Realizo el commit de la transacción
			em.getTransaction().commit();
			// Cierro la conexión
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}
	}

	@Override
	public void deleteManga(Manga manga) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo la transacción
			em.getTransaction().begin();
			// Elimino el objeto de la base de datos
			em.remove(manga);
			// Realizo el commit de la transacción
			em.getTransaction().commit();
			// Cierro la conexión
			em.close();
		// Si hay algún error, hago un rollback
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	// Leer todos los mangas
	public List<Manga> readAllManga() {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo una lista de tipo Manga
		List<Manga> listaMangas = new ArrayList<Manga>();
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo de la transacción
			em.getTransaction().begin();
			// Leo el objeto de la base de datos
			listaMangas = em.createQuery("SELECT m FROM Manga m").getResultList();
			// Realizo el commit de la transacción
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}
		// Devuelvo la lista
		return listaMangas;

	}

	
	// Realiza sentencias SQL

	public void sentenciaJSQL(String sentencia) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo la transacción
			em.getTransaction().begin();
			// Realizo la sentencia JSQL
			em.createQuery(sentencia);
			// Realizo el commit de la transacción
			em.getTransaction().commit();
			// Cierro la conexión
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}
	}

	// Vaciar una tabla

	public void vaciarTabla(String tabla) {
		// Creo un objeto de tipo EntityManager
		EntityManager em = emf.createEntityManager();
		// Creo un try-catch para controlar los errores
		try {
			// Comienzo de la transacción
			em.getTransaction().begin();
			// Realizo la sentencia de vaciado de la tabla
			em.createQuery("DELETE FROM " + tabla).executeUpdate();
			// Realizo el commit de la transacción
			em.getTransaction().commit();
			// Cierro la conexión
			em.close();
		} catch (Exception e) {
			// Si hay algún error, hago un rollback
			if (em.getTransaction().isActive()) {
				// Realizo el rollback
				em.getTransaction().rollback();
			}
			// Imprimo la pila de errores
			e.printStackTrace();
		}
	}

}
