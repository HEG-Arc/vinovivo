/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.dao.oracle;

import ch.hearc.ig.vinovivo.metier.Vin;
import ch.hearc.ig.vinovivo.dao.base.VinDAO;
import ch.hearc.ig.vinovivo.exceptions.DAOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Morvan
 */
public class VinDAOImpl extends VinDAO{
    //private Database db;
    private EntityManager em;
    
    public VinDAOImpl(EntityManager em/*Database db*/) {
        this.em=em;
        //this.db=db;
    }
    
    @Override
    public List<Vin> findAll() throws DAOException {
        CriteriaBuilder qb = em.getCriteriaBuilder();
        CriteriaQuery<Vin> c = qb.createQuery(Vin.class);
        Root<Vin> r = c.from(Vin.class); //correspond au FROM d'une req
        TypedQuery<Vin> q = em.createQuery(c);
        List<Vin> result = q.getResultList();
        return result;
    }
    
    @Override
    public Vin findById(Integer id) throws DAOException{
        return em.find(Vin.class, id);
        
    }
    
    @Override
    public long insert(Vin vin) throws DAOException{
        em.persist(vin);
        return vin.getId();
    }
    
    @Override
    public void update(Vin vin) throws DAOException{
        Vin dbvin=em.find(Vin.class, vin.getId());
        dbvin.setNom(vin.getNom());
        dbvin.setDescription(vin.getDescription());
    }
    
    @Override
    public void delete(Vin vin) throws DAOException{
        Vin dbrest=em.find(Vin.class, vin.getId());
        em.remove(dbrest);
        
    }
}
