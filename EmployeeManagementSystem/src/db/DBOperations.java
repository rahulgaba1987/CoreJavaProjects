/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import bean.BankDetailBean;
import bean.LeaveDetailBean;
import bean.PersonalDetailBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RG
 */
public class DBOperations 
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
    public String insertEmployeeRecord(PersonalDetailBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into empdetail values(?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bean.getEmpcode());
            pstmt.setString(2, bean.getName());
            pstmt.setString(3, bean.getF_name());
            pstmt.setString(4, bean.getM_name()); 
            pstmt.setString(5, bean.getEmail());
            pstmt.setString(6, bean.getGender());
            pstmt.setString(7, bean.getDoj()); 
            pstmt.setString(8, bean.getMarital_status()); 
            pstmt.setString(9, bean.getNationality());
            pstmt.setString(10, bean.getMobile());
         
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertEmployeeRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public String insertLeaveRecord(LeaveDetailBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into leavedetail  values(?,?,?,?,)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bean.getEmpcode());
            pstmt.setString(2, bean.getEmail());
            pstmt.setString(3, bean.getContact());
            pstmt.setString(4, bean.getAddress()); 
            
         
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in   insertLeaveRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
     public String insertBankRecord(BankDetailBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
       
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into empbankdetail values(?,?,?,?,)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bean.getEmpcode());
            pstmt.setString(2, bean.getEmpname());
            pstmt.setString(3, bean.getAccountno());
            pstmt.setString(4, bean.getAddress()); 
            
         
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertBankRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    
}
