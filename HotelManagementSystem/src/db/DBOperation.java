/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import bean.CustInfoBean;
import bean.RoomBookingBean;
import bean.RoomClassBean;
import bean.RoomInfoBean2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RG
 */
public class DBOperation 
{
    public String checkLogin(String username, String password)
    {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
            con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from login");
           
            while(rs.next())
            {
                
             
                 
                if(username.equals(rs.getString("username")))
                {
                    if(password.equals(rs.getString("password")))
                    {
                        result = "valid";
                       
                    }
                }
                else
                {
                     result = "invalid";
                      
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is occurred in checkLogin method" + e);
        }
        finally
        {
            return result;
        }
    }
    
    public static String insertCustomerRecord(CustInfoBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into CUSTINFO(name, address, phone,type) values(?,?,?,?)";
            pstmt = con.prepareStatement(query);
          
            pstmt.setString(1, bean.getName());
            pstmt.setString(2, bean.getAddress());
            pstmt.setString(3, bean.getPhone()); 
            pstmt.setString(4, bean.getType());
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insert cUSTOMERRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public String insertRoomInfo(RoomInfoBean2 bean1)
    {
      
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into room(room_no,beds,category,tv,phone_service,wifi,gizer) values(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
          
            pstmt.setString(1, bean1.getRoom_no());
            pstmt.setString(2, bean1.getBeds());
            pstmt.setString(3, bean1.getCategory()); 
            pstmt.setBoolean(4,bean1.isTv());
            pstmt.setBoolean(5,bean1.isPhone_service());
            pstmt.setBoolean(6,bean1.isWifi());
            pstmt.setBoolean(7,bean1.isGizer());
         
   
             
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertRoomInfo method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public ArrayList getAllRoomDetail()
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
            
         ArrayList<RoomInfoBean2> alst=null;
        try
        {
            con = DBConnection.dbGetConnection();
       
            alst = new ArrayList<RoomInfoBean2>();
            pstmt = con.prepareStatement("select * from room");
            rs = pstmt.executeQuery();
           
            while(rs.next())
            {
                RoomInfoBean2 bean = new RoomInfoBean2();
                 bean = new RoomInfoBean2();
                bean.setId(rs.getString(1));
                bean.setRoom_no(rs.getString(2));
                bean.setBeds(rs.getString(3));
                bean.setCategory(rs.getString(4));
                
                bean.setTv((rs.getBoolean(5)));
                bean.setPhone_service((rs.getBoolean(6)));
                bean.setWifi((rs.getBoolean(7)));
                bean.setGizer((rs.getBoolean(8)));
               
                alst.add(bean);
               
             
                     
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception is occurred in getAllRoomRecord() method "+e);
        }
        finally
        {
            return alst;
        }
        
    }
    public String insertRoomClass(RoomClassBean bean1)
    {
      
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into room_class1(room_type,room_price) values(?,?)";
            pstmt = con.prepareStatement(query);
          
            pstmt.setString(1, bean1.getRoom_type());
            pstmt.setString(2, bean1.getRoom_price());
            
   
             
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertRoomClass method "+e);
        }
        finally
        {
            return result;
        }
    }
     public ArrayList getAllRoomClassDetail()
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
            
         ArrayList<RoomClassBean> alst=null;
        try
        {
            con = DBConnection.dbGetConnection();
       
            alst = new ArrayList<RoomClassBean>();
            pstmt = con.prepareStatement("select * from room_class1");
            rs = pstmt.executeQuery();
           
            while(rs.next())
            {
                RoomClassBean bean = new RoomClassBean();
                 
                bean.setRoom_type(rs.getString(1));
                bean.setRoom_price(rs.getString(2));
               
               
                alst.add(bean);
               
             
                     
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception is occurred in getAllRoomClassRecord() method "+e);
        }
        finally
        {
            return alst;
        }
        
    }
     public String insertRoomBooking(RoomBookingBean bean1)
    {
      
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into booking(name,address,room,guest,checkin,checkout,type) values(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
          
            pstmt.setString(1, bean1.getName());
            pstmt.setString(2, bean1.getAddress());
            pstmt.setString(3, bean1.getRoom()); 
            pstmt.setString(4,bean1.getGuest());
            pstmt.setString(5,bean1.getCheckin());
            pstmt.setString(6,bean1.getCheckout());
            pstmt.setString(7,bean1.getRoom_type());
         
   
             
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  roombooking method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    
    
}
