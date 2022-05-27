/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db.newpackage;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class DBConnection {
    
   static Connection con =null;
   static Connection connect()
   {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql:///javm_production_database","root","12345");
       }
       catch(Exception e)
       {
           System.out.println("Exception has occured" + e);
       }
       finally
       {
           return con;
       }
   }
   
    
    
    
}
