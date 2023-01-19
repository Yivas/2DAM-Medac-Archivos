package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Metodos implements Ejercicio8Interfaz {

	
	private SessionFactory factory;
	@Override
    public void createManga(Manga manga) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Comienzo 
            transaction = session.beginTransaction();
            // Guardo el objeto
            session.save(manga);
            // Realizo el commit
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Manga readManga(int id) {
		Manga manga = null;
    	Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo 
			transaction = session.beginTransaction();
			// Guardo el objeto
			manga = session.get(Manga.class, id);
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return manga;

    }

    @Override
    public void updateManga(Manga manga) {
        Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo 
			transaction = session.beginTransaction();
			// Actualizo el objeto
			session.update(manga);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		

    }

    
    @Override
    public void deleteManga(Manga manga) {
        Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo
			transaction = session.beginTransaction();
			// Elimino el objeto
			session.delete(manga);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

    }


	@SuppressWarnings("unchecked")
	@Override
	public List<Manga> readAllManga() {
		List <Manga> listaMangas = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Guardo el objeto
			listaMangas = session.createQuery("From Manga").list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaMangas;
		
	}


	// Realiza sentencias SQL

	public void sentenciaSQL(String sentencia) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo
			transaction = session.beginTransaction();
			// Elimino el objeto
			session.createQuery(sentencia);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// Vaciar una tabla

	public void vaciarTabla(String tabla) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo
			transaction = session.beginTransaction();
			// Elimino el objeto
			session.createQuery("DELETE FROM " + tabla);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
