package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Eduardo
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/BancoCM", "adminteste", "123");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro); 
        }
    }
}