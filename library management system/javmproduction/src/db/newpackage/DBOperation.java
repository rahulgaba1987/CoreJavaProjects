/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db.newpackage;


import bean.Add_Book_EntryData;
import bean.Add_Circulation_Entry_bean;
import bean.DemoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class DBOperation 
{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs=null;
    String result="";
    public String authenticate(String Username,String Password)
    {
        try
        {
            con = DBConnection.connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from log_in");
                 System.out.println("Username id.. ..");
            while(rs.next())
            {
                 System.out.println("Username id.. .."+Username);
                  System.out.println("Username id .."+Password);
                  System.out.println("Username id db .."+rs.getString("Username"));
                          System.out.println("Password id db .."+rs.getString("Password"));
                if(Username.equals(rs.getString("Username")))
                {
                    if(Password.equals(rs.getString("Password")))
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
            System.out.println("Exception has been accured" + e);
        }
        finally
        {
            return result;
        }
    }  
    public String addRecord(DemoBean bean)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        String result="empty";
        try
        {
            con= DBConnection.connect();
            pstm=con.prepareStatement("insert into demo(RollNo,Name,Class1) values(?,?,?)");
            pstm.setInt(1,bean.getRollNo());
            pstm.setString(2,bean.getName());
            pstm.setString(3,bean.getClass1());
            int i=pstm.executeUpdate();
            if(i>0)
            {            
                result="added";
                System.out.println("Record Added.."+result);
            }
            
        }
        catch(Exception e)
                {
                    System.out.println("Exception is occered in addRecord() method "+e);
                }
        finally
        {
            return result;
        }
    }
    
                                            // Add Book Entry Record
    
    public String addBookRecord(Add_Book_EntryData objBookEntry)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        String entry="empty";
        try
        {
            con= DBConnection.connect();
            pstm=con.prepareStatement("insert into add_book_entry(Book_ID,Book_Name,Book_Author,Book_Publication,Book_Supplier,Book_Cost,Department_Name) values(?,?,?,?,?,?,?)");
            pstm.setInt(1,objBookEntry.getBook_ID());
            pstm.setString(2,objBookEntry.getBook_Name());
            pstm.setString(3,objBookEntry.getBook_Author());
            pstm.setString(4,objBookEntry.getBook_Publication());
            pstm.setString(5,objBookEntry.getBook_Supplier());
            pstm.setInt(6,objBookEntry.getBook_Cost());
            pstm.setString(7,objBookEntry.getDepartment_Name());
            
            int i=pstm.executeUpdate();
            if(i>0)
            {            
                entry="added";
                System.out.println("Record Added.."+entry);
            }
            
        }
        catch(Exception e)
                {
                    System.out.println("Exception is occered in addBookRecord() method " + e);
                }
        finally
        {
            return entry;
        }
    }
    
                                         //  Retrive a Record in database to textboxes.
    
public ArrayList getAllDetailList()
        {
            ArrayList alst= new ArrayList();
            Connection con=null;
            ResultSet rs=null;
            try
            {
                con=db.newpackage.DBConnection.connect();
                Statement stmt = con.createStatement();
                rs = stmt.executeQuery("select * from add_book_entry");
                while(rs.next())
                {
                    Add_Book_EntryData objInfornationBean = new Add_Book_EntryData();
                    objInfornationBean.setBook_ID(rs.getInt("Book_ID"));
                    objInfornationBean.setBook_Name(rs.getString("Book_Name"));
                    objInfornationBean.setBook_Author(rs.getString("Book_Author"));
                    objInfornationBean.setBook_Publication(rs.getString("Book_Publication"));
                    objInfornationBean.setBook_Supplier(rs.getString("Book_Supplier"));
                    objInfornationBean.setBook_Cost(rs.getInt("Book_Cost"));
                    objInfornationBean.setDepartment_Name(rs.getString("Department_Name"));
                    alst.add(objInfornationBean);       
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception has occurred in getAllDetailList methos.."+e);
            }
            finally
            {
                System.out.println("Size of arraylist"+alst.size());
                return alst;
            }    
        }
                                                
                                            // Add Circulation Entry Record

     public String addcirculationrecord(Add_Circulation_Entry_bean objCirculationEntry)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        String entry="empty";
        try
        {
            con= DBConnection.connect();
            pstm=con.prepareStatement("insert into add_circulation_entry(Book_ID,Book_Name,Student_Name,Student_Class,Student_RollNo,Date_of_Issued,Date_of_Return,Total_Fine,Book_Received) values(?,?,?,?,?,?,?,?,?)");
            pstm.setInt(1,objCirculationEntry.getBook_ID());
            pstm.setString(2,objCirculationEntry.getBook_Name());
            pstm.setString(3,objCirculationEntry.getStudent_Name());
            pstm.setString(4,objCirculationEntry.getStudent_Class());
            pstm.setInt(5,objCirculationEntry.getStudent_RollNo());
            pstm.setString(6,objCirculationEntry.getDate_of_Issued());
            pstm.setString(7,objCirculationEntry.getDate_of_Return());
            pstm.setInt(8,objCirculationEntry.getTotal_Fine());
            pstm.setString(9,objCirculationEntry.getBook_Received());
            
            int i=pstm.executeUpdate();
            if(i>0)
            {            
                entry="added";
                System.out.println("Record Added.."+entry);
            }
            
        }
        catch(Exception e)
                {
                    System.out.println("Exception is occered in addBookRecord() method "+e);
                }
        finally
        {
            return entry;
        }
    }
//     public ArrayList getCirculationDetailList()
//        {
//            ArrayList alst= new ArrayList();
//            Connection con=null;
//            ResultSet rs=null;
//            try
//            {
//                con=db.newpackage.DBConnection.connect();
//                Statement stmt = con.createStatement();
//                rs = stmt.executeQuery("select * from add_circulation_entry");
//                while(rs.next())
//                {
//                    Add_Circulation_Entry_bean objInfornationBean = new Add_Circulation_Entry_bean();
//                    objInfornationBean.setBook_ID(rs.getInt("Book_ID"));
//                    objInfornationBean.setBook_Name(rs.getString("Book_Name"));
//                    objInfornationBean.setStudent_Name(rs.getString("Student_Name"));
//                    objInfornationBean.setStudent_Class(rs.getString("Student_Class"));
//                    objInfornationBean.setStudent_RollNo(rs.getInt("Student_RollNo"));
//                    objInfornationBean.setDate_of_Issued(rs.getString("Date_of_Issued"));
//                    objInfornationBean.setDate_of_Return(rs.getString("Date_of_Return"));
//                    objInfornationBean.setTotal_Fine(rs.getInt("Total_Fine"));
//                    objInfornationBean.setBook_Received(rs.getString("Book_Received"));
//                    alst.add(objInfornationBean);       
//                }
//            }
//            catch(Exception e)
//            {
//                System.out.println("Exception has occurred in getAllDetailList methos.."+e);
//            }
//            finally
//            {
//                System.out.println("Size of arraylist"+alst.size());
//                return alst;
//            }    
//        }
   
}