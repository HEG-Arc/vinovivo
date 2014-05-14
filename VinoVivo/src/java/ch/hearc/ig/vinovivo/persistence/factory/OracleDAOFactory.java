/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.persistence.factory;

import ch.hearc.ig.vinovivo.oracle.Database;
import ch.hearc.ig.vinovivo.oracle.OracleDatabase;
import ch.hearc.ig.vinovivo.dao.oracle.VinDAOImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author julien
 */
public class OracleDAOFactory extends AbstractDAOFactory{
    
    private static AbstractDAOFactory factory;
    private static Database database;
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static AbstractDAOFactory getFactory() {
        if (factory == null) {
            factory = new OracleDAOFactory();
        }
        return factory;
    }
    
    @Override
    public EntityManager getEntityManager(){
        if(emf==null){
            emf=Persistence.createEntityManagerFactory("VinoVivoPU");
            System.out.println("Factory created:"+emf.isOpen());        
        }
        if(em==null){
            em=emf.createEntityManager();
        }
        return em;        
    }
    
    @Override
        public Database getDatabase() {
        if(database==null){
            database=new OracleDatabase();
        }
        return database;
    }

    @Override
    public VinDAOImpl getVinDAO(EntityManager em) {
        return new VinDAOImpl(em);
    }
    
}
