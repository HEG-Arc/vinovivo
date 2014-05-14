/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.vinovivo.oracle;

import ch.hearc.ig.vinovivo.exceptions.DatabaseException;
import javax.sql.DataSource;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author mitch
 */
public class OracleDatabase extends Database {
    
    private static final String USER = "pt11_perrinja";
    private static final String PASSWORD = "pt11_perrinja";
    private static final String HOST = "ne-ege-leto.ig.he-arc.ch";
    private static final String PORT = "1521";
    private static final String SID = "ens2";
    
    @Override
    protected synchronized DataSource getDataSource() throws DatabaseException {
        if (super.dataSource == null) {
            OracleDataSource ods=null;
            try {
                if(super.dataSource == null){
                    String url = "jdbc:oracle:thin:@" + HOST + ":" + PORT + ":" + SID;

                    ods = new OracleDataSource();
                    ods.setUser(USER);
                    ods.setPassword(PASSWORD);
                    ods.setURL(url);
                }
                super.dataSource=ods;
            } catch (Exception ex) {
                throw new DatabaseException(ex);
            }
        }
        return this.dataSource;
    }
}
