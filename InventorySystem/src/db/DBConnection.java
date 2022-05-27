/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin0
 */
public class DBConnection {
    static Connection dbGetConnection()
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///inventoryinfo","root","12345");
            
    }
        catch(Exception e)
        {
            System.out.println("Error if occured in dbGetConnection method"+e);
            
        }
    finally
        {
            return con;
        }
}
  
    
}