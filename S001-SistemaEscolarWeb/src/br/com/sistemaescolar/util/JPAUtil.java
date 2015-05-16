package br.com.sistemaescolar.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private JPAUtil() {
    }
 
    private static EntityManagerFactory entityManagerFactory;
 
    public static EntityManager getEntityManager(){
        if (entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("S001-SistemaEscolarWeb");
        }
 
        return entityManagerFactory.createEntityManager();
    }
}
