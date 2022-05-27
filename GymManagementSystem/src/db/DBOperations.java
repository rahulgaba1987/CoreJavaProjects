/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;



import bean.MemberDetailBean;
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
            rs = stmt.executeQuery("select max(id) from memberdetail1");
           
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
    public String insertMemberRecord(MemberDetailBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into memberdetail1 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bean.getId());
            pstmt.setString(2, bean.getName());
            pstmt.setString(3, bean.getContact());
            pstmt.setString(4, bean.getAddress()); 
            pstmt.setString(5, bean.getEmail());
            pstmt.setString(6, bean.getE_contact());
            pstmt.setString(7, bean.getMember_category()); 
            pstmt.setString(8, bean.getReceipt()); 
            pstmt.setString(9, bean.getPayment());
            pstmt.setString(10, bean.getGender());
            pstmt.setDouble(11, bean.getHeight()); 
            pstmt.setDouble(12, bean.getWeight());
            pstmt.setString(13, bean.getRemarks());
         
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }  
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertMmeberRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public ArrayList getAllMembersRecord()
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
            
              ArrayList<MemberDetailBean> alst=null;
        try
        {
            con = DBConnection.dbGetConnection();
       
            alst = new ArrayList<MemberDetailBean>();
            pstmt = con.prepareStatement("select * from memberdetail1");
            rs = pstmt.executeQuery();
           
            if(rs.next())
            {
                MemberDetailBean bean = new MemberDetailBean();
                 bean = new MemberDetailBean();
                bean.setId(rs.getInt(1));
                bean.setName(rs.getString(2));
                bean.setContact(rs.getString(3));
                bean.setAddress(rs.getString(4)); 
                bean.setEmail(rs.getString(5));
                bean.setE_contact(rs.getString(6));
                bean.setMember_category(rs.getString(7)); 
                bean.setReceipt(rs.getString(8)); 
                bean.setPayment(rs.getString(9));
                bean.setGender(rs.getString(10));
                bean.setHeight(rs.getDouble(11));
                bean.setWeight(rs.getDouble(12)); 
                bean.setRemarks(rs.getString(13)); 
                alst.add(bean);
               
             
                     
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception is occurred in getAllMembersRecord() method "+e);
        }
        finally
        {
            return alst;
        }
    }
    public   MemberDetailBean getRecordById(int id)
    {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
         MemberDetailBean bean=null;

    
        try
        {
             con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("select * from memberdetail1 where id="+id);
   
           
            rs = pstmt.executeQuery();
           
            if(rs.next())
            {
               bean = new MemberDetailBean();
             
                bean.setId(rs.getInt(1));
                bean.setName(rs.getString(2));
                bean.setContact(rs.getString(3));
                bean.setAddress(rs.getString(4)); 
                bean.setEmail(rs.getString(5));
                bean.setE_contact(rs.getString(6));
                bean.setMember_category(rs.getString(7)); 
                bean.setReceipt(rs.getString(8)); 
                bean.setPayment(rs.getString(9));
                bean.setGender(rs.getString(10));
                bean.setHeight(rs.getDouble(11));
                bean.setWeight(rs.getDouble(12)); 
                bean.setRemarks(rs.getString(13)); 
      
               
             
                     
            }
        }
        catch(Exception e)
        {
             System.out.println("Exception is occurred in  getRecordById()" + e);
        }
        finally
        {
            return bean;
        }
    }

    
}
