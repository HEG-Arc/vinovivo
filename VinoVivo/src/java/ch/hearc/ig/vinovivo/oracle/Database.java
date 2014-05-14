/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.oracle;

import ch.hearc.ig.vinovivo.exceptions.DatabaseException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author Prof
 */
public abstract class Database {

    protected DataSource dataSource;
    protected Connection c;

    public synchronized Connection getConnection() throws ClassNotFoundException, SQLException, DatabaseException {
        if (!this.isOpen()) {
            
            this.c = this.getDataSource().getConnection();
        }
        return this.c;
    }
    
    protected abstract DataSource getDataSource() throws DatabaseException;

    public Boolean isOpen() throws SQLException {
        return this.c != null && !this.c.isClosed();
    }

    public void releaseConnection() throws SQLException {
        if (this.c != null) {
            this.c.close();
        }
    }

    public void commit() throws SQLException {
        if (this.isOpen()) {
            this.c.commit();
        }
    }

    public void rollback() throws SQLException {
        if (this.isOpen()) {
            this.c.rollback();
        }
    }
}
