/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import bean.RoomInfoBean2;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RG
 */
public class DBConnection 
{
     static Connection dbGetConnection()
    {
        Connection con=null;
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:///hoteldb","root","12345");
            
            RoomInfoBean2 b = new RoomInfoBean2();
           
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
