/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jyoti
 */
public class DBConnection
{
    static Connection dbGetConnection()
    {
        Connection con=null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///usermaster","root","");
        } 
        catch (Exception e) 
        {
            System.out.println("Error is occurred in dbGetConnection method"+e);
        }
        finally
        {
            return con;
        }
    }
    
}
