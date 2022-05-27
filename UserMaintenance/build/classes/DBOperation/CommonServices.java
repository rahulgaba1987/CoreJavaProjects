/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperation;

import bean.LoginBean;
import bean.UserDetailBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jyoti
 */
public class CommonServices
{
    
    public String checkLogin(LoginBean bean)
    {
        String result="invalid";
        ResultSet rs=null;
        Statement stmt;;
        Connection con=null;
        System.out.println("Bean.....Username is...."+bean.getUsername()+"....Password..."+bean.getPassword());
        try 
        {
            con=DBConnection.dbGetConnection();
            stmt = con.createStatement();
            String query="select username,password from login"; 
            System.out.println("Hello");
            rs= stmt.executeQuery(query);
            if(rs.next())
            {
                System.out.println("Database.....Username is...."+rs.getString(1)+"....Password..."+rs.getString(2));
                if(rs.getString(1).equals(bean.getUsername()) && rs.getString(2).equals(bean.getPassword()))
                {
                    result="valid";
                }
            }
            
        } 
        catch (Exception e) 
        {
            System.out.println("Error is occurred in checklogin() method.."+e);
        }
        finally
        {
            System.out.println("Value of result is..."+result);
            return result;
        }
    }
    
    public String addUserDetail(UserDetailBean bean)
    {
        String result="empty";
        Connection con=null;
        PreparedStatement pstmt=null;
        try 
        {
            con=DBConnection.dbGetConnection();
 
            String q="insert into userdetail values(?,?,?,?,?,?,?,?)";
            pstmt=con.prepareStatement(q);
            pstmt.setInt(1,bean.getId());
           pstmt.setString(2,bean.getUsername());
           pstmt.setString(3,bean.getEmail());
            pstmt.setString(4,bean.getContact());
            
                pstmt.setString(5,bean.getS_question());
             pstmt.setString(6,bean.getS_answer());
             pstmt.setString(7,bean.getStatus());
             pstmt.setString(8,bean.getD_o_j());
             int i=pstmt.executeUpdate();
             if(i>0)
             {
                 result="add";
                 System.out.println("Record inserted");
             }
             else
             {
                 System.out.println("Record is not inserted");
             }
            
            
        } 
        catch (Exception e) 
        {
            System.out.println("Exception is occurred in addUserDetail method"+e);
        }
        finally
        {
            return  result;
        }
    }
    public ArrayList getData()
    {
        String status="";
        Connection con=null;
        ResultSet rs=null;
        ArrayList alst = new ArrayList();
        Statement stmt=null;
        try 
        {
            UserDetailBean bean;
            con=DBConnection.dbGetConnection();
            String query="Select * from userdetail";
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            while(rs.next())
            {
                bean = new UserDetailBean();
                bean.setId(rs.getInt(1));
              ;
                bean.setUsername(rs.getString(2));
                bean.setEmail(rs.getString(3));
                
                        bean.setContact(rs.getString(4));
                        bean.setS_question(rs.getString(5));
                        bean.setS_answer(rs.getString(6));
                        bean.setStatus(rs.getString(7));
                        bean.setD_o_j(rs.getString(8));
                        alst.add(bean);
                        
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error is ocuurred in getData() method.."+e);
        }
        finally
        {
            return alst;
        }
    }
    
}
