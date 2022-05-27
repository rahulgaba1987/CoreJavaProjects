/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;



import bean.AddStudentBean;
import bean.RoomBean;
import bean.StudentUpdateBean;
import hostelmanagementsystem.AddNewStudent;
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
//     public static int getMAxRegId()
//    {
//         Connection con=null;
//        Statement stmt=null;
//        ResultSet rs = null;
//        int id=0;
//        try
//        {
//            con = DBConnection.dbGetConnection();
//            stmt = con.createStatement();
//            rs = stmt.executeQuery("select max(id) from memberdetail1");
//           
//            while(rs.next())
//            {
//                id=rs.getInt(1);
//                System.out.println("id  is  "+id);
//                     
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Exception is occurred in getMAxRegIdmethod" + e);
//        }
//        finally
//        {
//            return id;
//        }
//    }
    public String insertRoomRecord(RoomBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into room values(?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, bean.getRoomNo());
            pstmt.setBoolean(2, bean.getActive());
            pstmt.setBoolean(3, bean.getStatus());
           
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }  
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertRoomRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
    
    public ArrayList getAllRoomRecord()
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
            
              ArrayList<RoomBean> alst=null;
        try
        {
            con = DBConnection.dbGetConnection();
       
            alst = new ArrayList<RoomBean>();
            pstmt = con.prepareStatement("select * from room");
            rs = pstmt.executeQuery();
           
            while(rs.next())
            {
                RoomBean bean = new RoomBean();
                 bean = new RoomBean();
                bean.setRoomNo(rs.getString(1));
                bean.setActive(rs.getBoolean(2));
                bean.setStatus(rs.getBoolean(3));
               
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
    public   RoomBean getRoomById(String id)
    {
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        RoomBean bean=null;

    
        try
        {
             con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("select * from room where room_no="+id);
   
           
            rs = pstmt.executeQuery();
           
            if(rs.next())
            {
               bean = new RoomBean();
             
            
                 bean = new RoomBean();
                bean.setRoomNo(rs.getString(1));
                bean.setActive(rs.getBoolean(2));
                bean.setStatus(rs.getBoolean(3));
                     
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
    
     public String updateRoomRecord(RoomBean bean)
     {
        Connection con=null;
        PreparedStatement pstmt=null;
       
        String result="failed";
        try
        {
            con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("update room set room_active=?, status=? where room_no=?");
            
           
            pstmt.setBoolean(1, bean.getActive());
               pstmt.setBoolean(2, bean.getStatus());
                pstmt.setString(3, bean.getRoomNo());
        
            int i = pstmt.executeUpdate();
            if(i>0)
            {
                result="updated";
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not updated");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("updateRoom Record() : " + e);
        }
        return result;
    }
     
      public String insertstudentRecord(AddStudentBean bean)
    {
        
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        String result="invalid";
        try
        {
             con = DBConnection.dbGetConnection();
         
            String query="insert into student values(?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, bean.getSt_id());
            pstmt.setString(2, bean.getName());
            pstmt.setString(3, bean.getF_name());
            pstmt.setString(4, bean.getM_name());
            pstmt.setString(5, bean.getEmail());
            pstmt.setString(6, bean.getAddress());
            pstmt.setString(7, bean.getCollege());
            pstmt.setString(8, bean.getAdhar());
            pstmt.setString(9, bean.getContact());
            pstmt.setString(10, bean.getRoom_no());
           
            
            int i = pstmt.executeUpdate();
            if(i>0)
            {
              
                result="valid";
            }  
        } 
        catch (Exception e)
        {
            System.out.println("Exception is occurred in  insertStudentRecord method "+e);
        }
        finally
        {
            return result;
        }
    }
//    public   RoomBean getRoomById(String id)
//    {
//        Connection con=null;
//        PreparedStatement pstmt=null;
//        ResultSet rs = null;
//        RoomBean bean=null;
//
//    
//        try
//        {
//             con = DBConnection.dbGetConnection();
//            pstmt = con.prepareStatement("select * from room where room_no="+id);
//   
//           
//            rs = pstmt.executeQuery();
//           
//            if(rs.next())
//            {
//               bean = new RoomBean();
//             
//            
//                 bean = new RoomBean();
//                bean.setRoomNo(rs.getString(1));
//                bean.setActive(rs.getBoolean(2));
//                bean.setStatus(rs.getBoolean(3));
//                     
//            }
//        }
//        catch(Exception e)
//        {
//             System.out.println("Exception is occurred in  getRecordById()" + e);
//        }
//        finally
//        {
//            return bean;
//        }
//    }
    
     public AddStudentBean getStudentRecordByMobile(String  m)
     {
        Connection con=null;
        PreparedStatement pstmt=null;
       
        String result="failed";
        ResultSet rs=null;
        AddStudentBean bean=null;
        try
        {
            con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("select * from student where contact ="+m);
            rs = pstmt.executeQuery();
            if(rs.next())
            {      bean= new AddStudentBean();
                   bean.setSt_id(String.valueOf(rs.getInt(1)));
                   bean.setName(String.valueOf(rs.getString(2)));
                   bean.setF_name(String.valueOf(rs.getString(3)));
                   bean.setM_name(String.valueOf(rs.getString(4)));
                    bean.setEmail(String.valueOf(rs.getString(5)));
                   bean.setAddress(String.valueOf(rs.getString(6)));
                   bean.setCollege(String.valueOf(rs.getString(7)));
                   bean.setAdhar(String.valueOf(rs.getString(8)));
                   bean.setContact(String.valueOf(rs.getString(9)));
                   bean.setRoom_no(String.valueOf(rs.getString(10)));
                      
                      
            }
          
            
           
        
        } 
        catch (Exception e) 
        {
            System.out.println("getStudentRecordByMobile : " + e);
        }
        return bean;
    }
     

    
public String updateStudentRecord(StudentUpdateBean bean)
     {
        Connection con=null;
        PreparedStatement pstmt=null;
       
        String result="failed";
        try
        {
            con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("update student set st_id=?, name=?,f_name=?,m_name=?,email=?, address=?,college=?, adhar=?, room_no=?  where contact=?");
            
           pstmt.setInt(1, bean.getId());
            pstmt.setString(2, bean.getName());
            pstmt.setString(3, bean.getFather());
            pstmt.setString(4, bean.getMother());
            pstmt.setString(5, bean.getEmail());
            pstmt.setString(6, bean.getAddress());
            pstmt.setString(7, bean.getCollege());

            pstmt.setString(8, bean.getAdhar());
          
            pstmt.setString(9, bean.getRoom());
              pstmt.setString(10, bean.getMobile());

        
            int i = pstmt.executeUpdate();
            if(i>0)
            {
                result="updated";
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not updated");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("updateRoom Record() : " + e);
        }
        return result;
    }
    
}
