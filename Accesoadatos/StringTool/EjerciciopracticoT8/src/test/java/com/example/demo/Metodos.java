package com.example.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Metodos implements Ejercicio8Interfaz {

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
			// Realizo el commit
			transaction.commit();
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
	public ArrayList<Manga> readAllManga() {
		ArrayList <Manga> listaMangas = new ArrayList <Manga>();
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo 
			transaction = session.beginTransaction();
			// Guardo el objeto
			listaMangas = (ArrayList<Manga>) session.createQuery("from Manga").list();
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listaMangas;
		
	}
	
}
