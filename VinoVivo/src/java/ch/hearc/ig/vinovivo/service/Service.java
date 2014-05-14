/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.service;

import ch.hearc.ig.vinovivo.dao.base.VinDAO;
import ch.hearc.ig.vinovivo.exceptions.DAOException;
import ch.hearc.ig.vinovivo.exceptions.VinServicesException;
import ch.hearc.ig.vinovivo.metier.Vin;
import ch.hearc.ig.vinovivo.persistence.factory.AbstractDAOFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author Morvan
 */
public class Service {

    private static EntityManager em;

    private static VinDAO vinDAO;

    public Service() {
        AbstractDAOFactory factory = AbstractDAOFactory.getFactory("oracle");
        this.em = factory.getEntityManager();
        this.vinDAO = factory.getVinDAO(em);
    }

    public List<Vin> getAllVins() throws VinServicesException {
        List<Vin> arl = null;
        try {
            arl = vinDAO.findAll();
        } catch (DAOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            throw new VinServicesException("Erreur lors de la recherche de tous les restaurants");
        }
        return arl;
    }

    public Vin addVin(String ref, String nom, String description) throws VinServicesException {
        //Force la FK du type a 1
        Vin vin = new Vin(ref, nom, description);
        //restaurantType.getRestaurants().add(restaurant);

        long numeroVin;
        try {
            em.getTransaction().begin();
            numeroVin = vinDAO.insert(vin);
            //restaurant.setId((int)(long)numeroRestaurant);
            //localisationDAO.insert(restaurant.getAddress());
            //db.commit();
            em.getTransaction().commit();
        } catch (Throwable ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            em.getTransaction().rollback();
            vin = null;
            throw new VinServicesException();
        }
        return vin;
    }
}
