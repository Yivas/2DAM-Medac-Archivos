package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

// Clase para crear la sesion de hibernate
public class HibernateUtil {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    // Metodo para crear la sesion
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Creo el registro de la sesion
                registry = new StandardServiceRegistryBuilder().configure().build();

                // Creo los metadatos
                MetadataSources sources = new MetadataSources(registry);

                // Creo los metadatos
                Metadata metadata = sources.getMetadataBuilder().build();

                // Creo la sesion
                sessionFactory = metadata.getSessionFactoryBuilder().build();

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}