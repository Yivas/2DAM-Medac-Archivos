package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Metodos implements Ejercicio9Interfaz {

	EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("objectdb:$objectdb/db/biblioteca_manga.odb");
	EntityManager em = emf.createEntityManager();
	

	// Crear un manga
	@Override
    public void createManga(Manga manga) {
        try {
        	// Comienzo 
        	em.getTransaction().begin();
            // Guardo el objeto
            em.persist(manga);
            // Realizo el commit
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

	// Leer un manga
    @Override
    public Manga readManga(int id) {
		Manga manga = null;
		try {
			// Comienzo 
			em.getTransaction().begin();
			// Leo el objeto
			manga = em.find(Manga.class, id);
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return manga;

    }

    @Override
    public void updateManga(Manga manga) {
		try {
			// Comienza
			em.getTransaction().begin();
			// Actualizo el objeto
			em.merge(manga);
			// Realizo el commit
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		

    }

    
    @Override
    public void deleteManga(Manga manga) {
		try {
			// Comienzo 
			em.getTransaction().begin();
			// Elimino el objeto
			em.remove(manga);
			// Realizo el commit
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

    }


	@SuppressWarnings("unchecked")
	@Override
	public List<Manga> readAllManga() {
		List<Manga> listaMangas = new ArrayList<Manga>();
		try {
			// Comienzo 
			em.getTransaction().begin();
			// Leo el objeto
			listaMangas = em.createQuery("SELECT m FROM Manga m").getResultList();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return listaMangas;
		
	}


	// Realiza sentencias SQL

	public void sentenciaJSQL(String sentencia) {
		try {
			// Comienzo 
			em.getTransaction().begin();
			// Realizo la sentencia
			em.createQuery(sentencia);
			// Realizo el commit
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}


	// Vaciar una tabla

	public void vaciarTabla(String tabla) {
		try {
			// Comienzo 
			em.getTransaction().begin();
			// Realizo la sentencia
			em.createQuery("DELETE FROM " + tabla);
			// Realizo el commit
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	
}
