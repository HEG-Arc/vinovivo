/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.vinovivo.exceptions;

/**
 *
 * @author Prof
 */
public class DAOException extends Exception {

    public DAOException() {
        super();
    }

    public DAOException(String msg) {
        super(msg);
    }

    public DAOException(Throwable ex) {
        super(ex);
    }

}
