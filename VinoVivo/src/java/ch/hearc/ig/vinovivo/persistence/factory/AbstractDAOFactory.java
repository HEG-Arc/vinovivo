/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.persistence.factory;

import ch.hearc.ig.vinovivo.oracle.Database;
import ch.hearc.ig.vinovivo.dao.oracle.VinDAOImpl;
import javax.persistence.EntityManager;

/**
 *
 * @author Morvan
 */
public abstract class AbstractDAOFactory {
    
    public static AbstractDAOFactory getFactory(String base) {
        if (base.equals("oracle")) {
            return OracleDAOFactory.getFactory();
        } else {
            //return JavaDBDAOFactory.getFactory();
            return null;
        }
    }
    public abstract Database getDatabase();
    public abstract EntityManager getEntityManager();
    public abstract VinDAOImpl getVinDAO(EntityManager em);
    
}
