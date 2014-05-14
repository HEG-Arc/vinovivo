/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.dao.base;

import ch.hearc.ig.vinovivo.metier.Vin;
import ch.hearc.ig.vinovivo.exceptions.DAOException;
import java.util.List;

/**
 *
 * @author Morvan
 */
public abstract class VinDAO {
    public abstract List<Vin> findAll()throws DAOException;
    public abstract Vin findById(Integer id) throws DAOException;
    public abstract long insert(Vin vin) throws DAOException;
    public abstract void update(Vin vin) throws DAOException;
    public abstract void delete(Vin vin) throws DAOException;
}
