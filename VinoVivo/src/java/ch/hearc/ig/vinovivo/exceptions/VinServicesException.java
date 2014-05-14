/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.exceptions;

/**
 *
 * @author julien
 */
public class VinServicesException extends Exception{
    public VinServicesException() {
        super();
    }

    public VinServicesException(String msg) {
        super(msg);
    }

    public VinServicesException(Throwable ex) {
        super(ex);
    }
}
