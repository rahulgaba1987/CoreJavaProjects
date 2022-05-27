/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;



import bean.AddCompanyDetailBean;
import bean.CompanyScheduleBean;
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
    public String insertCompanyRecord(AddCompanyDetailBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into addcompany values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, bean.getName());
            pstmt.setString(2, bean.getCompanyType());
            pstmt.setString(3, bean.getHr_name());
            pstmt.setString(4, bean.getEmail()); 
            pstmt.setString(5, bean.getPhone());
            pstmt.setString(6, bean.getStreet());
            pstmt.setString(7, bean.getCity()); 
            pstmt.setString(8, bean.getPin()); 
            
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertcompanyRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public String insertCompanySchedule(CompanyScheduleBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into schedulecompany  values(?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, bean.getScheduleDate());
            pstmt.setString(2, bean.getCriteria());
            pstmt.setString(3, bean.getAcademicyear());
            pstmt.setString(4, bean.getMin_salary()); 
             pstmt.setString(5, bean.getComp_id()); 
              pstmt.setString(6, bean.getTpo_id()); 
            
         
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in   insertcompanyschedule method "+e);
        }
        finally
        {
            return result;
        }
    }
//     public String insertBankRecord(BankDetailBean bean)
//    {
//        
//        Connection con=null;
//        PreparedStatement pstmt=null;
//        ResultSet rs = null;
//       
//        String result="invalid";
//        try
//        {
//             con = DBConnection.dbGetConnection();
//         
//            String query="insert into empbankdetail values(?,?,?,?,)";
//            pstmt = con.prepareStatement(query);
//            pstmt.setInt(1, bean.getEmpcode());
//            pstmt.setString(2, bean.getEmpname());
//            pstmt.setString(3, bean.getAccountno());
//            pstmt.setString(4, bean.getAddress()); 
//            
//         
//            
//            int i = pstmt.executeUpdate();
//            if(i>0)
//            {
//              
//                result="valid";
//            }
//                
//                
//                
//         
//        } 
//        catch (Exception e)
//        {
//            System.out.println("Exception is occurred in  insertBankRecord method "+e);
//        }
//        finally
//        {
//            return result;
//        }
//    }
    
    
}
