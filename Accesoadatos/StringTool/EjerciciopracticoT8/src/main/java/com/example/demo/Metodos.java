package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Metodos implements Ejercicio8Interfaz {

	private SessionFactory factory;

	// Metodo para crear un manga en el cual se le pasa un objeto manga
	// y se guarda en la base de datos
	@Override
	public void createManga(Manga manga) {
		// Creo una variable de tipo transaction
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo de la transaccion
			transaction = session.beginTransaction();
			// Guardo el objeto en la base de datos
			session.save(manga);
			// Realizo el commit de la transaccion
			transaction.commit();
			// En caso de que haya un error se realiza un rollback
		} catch (Exception e) {
			// Compruebo si la transaccion esta activa y si es asi la realizo
			if (transaction != null) {
				// Realizo el rollback
				transaction.rollback();
			}
			// Imprimo el error
			e.printStackTrace();
		}
	}

	// Metodo para leer todos los mangas de la base de datos
	// y los guarda en una lista
	@Override
	public Manga readManga(int id) {
		// Creo una variable de tipo manga y la inicializo a null
		// tambien creo una variable de tipo transaction
		Manga manga = null;
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo de la transaccion
			transaction = session.beginTransaction();
			// Guardo el objeto en la base de datos
			manga = session.get(Manga.class, id);
			// En caso de que haya un error se realiza un rollback
		} catch (Exception e) {
			// Compruebo si la transaccion esta activa y si es asi la realizo
			if (transaction != null) {
				transaction.rollback();
			}
			// Imprimo el error
			e.printStackTrace();
		}
		return manga;

	}

	// Metodo para actualizar un manga en el cual se le pasa un objeto manga
	// y se actualiza en la base de datos
	@Override
	public void updateManga(Manga manga) {
		// Creo una variable de tipo transaction
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo de la transaccion
			transaction = session.beginTransaction();
			// Actualizo el objeto en la base de datos
			session.update(manga);
			// Realizo el commit de la transaccion
			transaction.commit();
			// En caso de que haya un error se realiza un rollback
		} catch (Exception e) {
			// Compruebo si la transaccion esta activa y si es asi la realizo
			if (transaction != null) {
				// Realizo el rollback
				transaction.rollback();
			}
			// Imprimo el error
			e.printStackTrace();
		}

	}

	// Metodo para eliminar un manga en el cual se le pasa un objeto manga
	// y se elimina en la base de datos
	@Override
	public void deleteManga(Manga manga) {
		// Creo una variable de tipo transaction
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo
			transaction = session.beginTransaction();
			// Elimino el objeto
			session.delete(manga);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			// Compruebo si la transaccion esta activa y si es asi la realizo
			if (transaction != null) {
				transaction.rollback();
			}
			// Imprimo el error
			e.printStackTrace();
		}

	}

	// Metodo para leer todos los mangas de la base de datos
	// y los guarda en una lista
	@SuppressWarnings("unchecked")
	@Override
	// Devuelve una lista de mangas
	public List<Manga> readAllManga() {
		// Creo una lista de mangas y la inicializo a null
		List<Manga> listaMangas = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Guardo el objeto
			listaMangas = session.createQuery("From Manga").list();
		} catch (Exception e) {
			// Imprimo el error
			e.printStackTrace();
		}
		return listaMangas;

	}

	// Realiza sentencias SQL
	// Se le pasa una sentencia SQL y la ejecuta
	// se usa para realizar consultas
	public void sentenciaSQL(String sentencia) {
		// Creo una variable de tipo transaction
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo
			transaction = session.beginTransaction();
			// Elimino el objeto
			session.createQuery(sentencia);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			// Imprimo el error
			e.printStackTrace();
		}
	}

	// Vaciar una tabla
	// Se le pasa el nombre de la tabla y la vacia
	public void vaciarTabla(String tabla) {
		// Creo una variable de tipo transaction
		Transaction transaction = null;
		// Creo un try con el cual se abre una sesion
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Comienzo la transaccion
			transaction = session.beginTransaction();
			// Elimino el objeto de la tabla
			session.createQuery("DELETE FROM " + tabla);
			// Realizo el commit
			transaction.commit();
		} catch (Exception e) {
			// Imprimo el error
			e.printStackTrace();
		}
	}

}
