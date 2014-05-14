/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.exceptions;

/**
 *
 * @author julien
 */
public class DatabaseException extends Exception{
    public DatabaseException() {
        super();
    }

    public DatabaseException(String msg) {
        super(msg);
    }

    public DatabaseException(Throwable ex) {
        super(ex);
    }
}
