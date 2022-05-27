/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import bean.StudentBean;
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
    public String insertStudentRecord(StudentBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into studentinformation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bean.getRegNo());
            pstmt.setString(2, bean.getSt_name());
            pstmt.setString(3, bean.getF_name());
            pstmt.setString(4, bean.getM_name()); 
            pstmt.setString(5, bean.getAddress());
            pstmt.setString(6, bean.getContact());
            pstmt.setString(7, bean.getDob()); 
            pstmt.setString(8, bean.getGender()); 
            pstmt.setString(9, bean.getCity());
            pstmt.setString(10, bean.getCourse());
            pstmt.setBoolean(11, bean.getSports());
            pstmt.setBoolean(12, bean.getCultural()); 
            pstmt.setBoolean(13, bean.getOther()); 
            pstmt.setString(14, bean.getTransport());
            pstmt.setString(15, bean.getPin());
            pstmt.setString(16, bean.getFees());
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
                
         
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertStudentRecord method ");
        }
        finally
        {
            return result;
        }
    }
    public static int getMAxRegId()
    {
         Connection con=null;
        Statement stmt=null;
        ResultSet rs = null;
        int id=0;
        try
        {
            con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select max(registration_no) from studentinformation");
           
            while(rs.next())
            {
                id=rs.getInt(1);
                System.out.println("id  is  "+id);
                     
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is occurred in getMAxRegIdmethod" + e);
        }
        finally
        {
            return id;
        }
    }
    public static ArrayList getAllStudentRecord()
    {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs = null;
        ArrayList<StudentBean> alst = new ArrayList<StudentBean>();
    
        try
        {
             con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from studentinformation");
           
            while(rs.next())
            {
                StudentBean bean = new StudentBean();
                bean.setRegNo(rs.getInt(1));
                bean.setSt_name(rs.getString(2));
                bean.setF_name(rs.getString(3));
                bean.setM_name(rs.getString(4)); 
                bean.setAddress(rs.getString(5));
                bean.setContact(rs.getString(6));
                bean.setDob(rs.getString(7)); 
                bean.setGender(rs.getString(8)); 
                bean.setCity(rs.getString(9));
                bean.setCourse(rs.getString(10));
                bean.setSports(rs.getBoolean(11));
                bean.setCultural(rs.getBoolean(12)); 
                bean.setOther(rs.getBoolean(13)); 
                bean.setTransport(rs.getString(14));
                bean.setPin(rs.getString(15));
                bean.setFees(rs.getString(16));
                alst.add(bean);
                     
            }
        }
        catch(Exception e)
        {
             System.out.println("Exception is occurred in  getAllStudentRecord()" + e);
        }
        finally
        {
            return alst;
        }
    }
    public static  StudentBean getFirstRecord()
    {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs = null;
         StudentBean bean=null;

    
        try
        {
             con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from studentinformation ");
           
            if(rs.next())
            {
                 bean = new StudentBean();
                bean.setRegNo(rs.getInt(1));
                bean.setSt_name(rs.getString(2));
                bean.setF_name(rs.getString(3));
                bean.setM_name(rs.getString(4)); 
                bean.setAddress(rs.getString(5));
                bean.setContact(rs.getString(6));
                bean.setDob(rs.getString(7)); 
                bean.setGender(rs.getString(8)); 
                bean.setCity(rs.getString(9));
                bean.setCourse(rs.getString(10));
                bean.setSports(rs.getBoolean(11));
                bean.setCultural(rs.getBoolean(12)); 
                bean.setOther(rs.getBoolean(13)); 
                bean.setTransport(rs.getString(14));
                bean.setPin(rs.getString(15));
                bean.setFees(rs.getString(16));
             
                     
            }
        }
        catch(Exception e)
        {
             System.out.println("Exception is occurred in  getFirstRecord()" + e);
        }
        finally
        {
            return bean;
        }
    }
    
    public static  StudentBean getRecordById(int id)
    {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs = null;
         StudentBean bean=null;

    
        try
        {
             con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from studentinformation where registration_no="+id);
           
            if(rs.next())
            {
                 bean = new StudentBean();
                bean.setRegNo(rs.getInt(1));
                bean.setSt_name(rs.getString(2));
                bean.setF_name(rs.getString(3));
                bean.setM_name(rs.getString(4)); 
                bean.setAddress(rs.getString(5));
                bean.setContact(rs.getString(6));
                bean.setDob(rs.getString(7)); 
                bean.setGender(rs.getString(8)); 
                bean.setCity(rs.getString(9));
                bean.setCourse(rs.getString(10));
                bean.setSports(rs.getBoolean(11));
                bean.setCultural(rs.getBoolean(12)); 
                bean.setOther(rs.getBoolean(13)); 
                bean.setTransport(rs.getString(14));
                bean.setPin(rs.getString(15));
                bean.setFees(rs.getString(16));
             
                     
            }
        }
        catch(Exception e)
        {
             System.out.println("Exception is occurred in  getRecordById(" + e);
        }
        finally
        {
            return bean;
        }
    }
    public static  String updateStudentRecordById(StudentBean bean,int id)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
         
            pstmt = con.prepareStatement("update studentinformation set  registration_no=?, st_name=?, f_name=?, m_name=?, address=?, contact=?,dob=?,gender=?,city=?,course=?,sports=?,cultural=?,others=?,trasport=?, pin=?,fees=? where registration_no="+id);
       
            pstmt.setInt(1, bean.getRegNo());
            pstmt.setString(2, bean.getSt_name());
            pstmt.setString(3, bean.getF_name());
            pstmt.setString(4, bean.getM_name()); 
            pstmt.setString(5, bean.getAddress());
            pstmt.setString(6, bean.getContact());
            pstmt.setString(7, bean.getDob()); 
            pstmt.setString(8, bean.getGender()); 
            pstmt.setString(9, bean.getCity());
            pstmt.setString(10, bean.getCourse());
            pstmt.setBoolean(11, bean.getSports());
            pstmt.setBoolean(12, bean.getCultural()); 
            pstmt.setBoolean(13, bean.getOther()); 
            pstmt.setString(14, bean.getTransport());
            pstmt.setString(15, bean.getPin());
            pstmt.setString(16, bean.getFees());
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }
                
                
               
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  updateStudentRecordById method "+e);
        }
        finally
        {
            return result;
        }
    }
    
}
