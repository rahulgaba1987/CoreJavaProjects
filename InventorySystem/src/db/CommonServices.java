/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;


import bean.CategoryBean;
import bean.LoginBean;
import bean.ProductBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Neenadevi
 */
public class CommonServices {
    public String checkLogin(LoginBean Bean)
    {
    String result ="invalid";
    ResultSet rs = null;
    Statement stmt;;
    Connection con=null;
    System.out.println("Bean...Username is ... "+Bean.getUsername()+"...Password..."+Bean.getPassword());
    try
    {
        con=DBConnection.dbGetConnection();
        stmt=con.createStatement();
        String query="select username, password from login";
        System.out.println("Hello");
        rs=stmt.executeQuery(query);
        if(rs.next())
        {
            System.out.println("Database...Username is...."+rs.getString(1)+"...Password ..."+rs.getString(2));
            if(rs.getString(1).equals(Bean.getUsername())&& rs.getString(2).equals(Bean.getPassword()))
            {
                result="valid";
                
            }
        }
    }
    catch(Exception e)
    {
        System.out.println("Error is occurred in checklogin() method..."+e);
    }
    finally
    {
        System.out.println("value of result is ...."+result);
        return result;
    }
} 
    public String insertCategoryDetail(CategoryBean bean)
    {
        String result="fail";
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        
        try
        {
            con= DBConnection.dbGetConnection();
            String query="insert into p_category values(?,?)";
         
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,bean.getCategory());
            pstmt.setString(2,bean.getStatus());
            
            int i= pstmt.executeUpdate();
               System.out.println("value of i----------."+i);
            if(i>0)
            {
                result="add";
                System.out.println("Record has been updated.");
            }
           
         

            }
        catch(Exception e)
        {
            System.out.println("Exception has been occurred in addCategory method   "+e);
        }
        finally
        {
            return result;
        }
    }
    public String insertProductDetail(ProductBean bean)
    {
        String result="fail";
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        
        try
        {
            con= DBConnection.dbGetConnection();
            String query="insert into product2 values(?,?,?,?,?,?,?,?)";
     
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,bean.getProduct());
            pstmt.setString(2,bean.getBrand());
            pstmt.setString(3,bean.getCategory());
            pstmt.setString(4,bean.getStatus());
            pstmt.setString(5,bean.getBarCode());
            pstmt.setString(6,bean.getCostPrice());
            pstmt.setString(7,bean.getRetailPrice());
            pstmt.setString(8,bean.getQty());
            
            int i= pstmt.executeUpdate();
               System.out.println("value of i----------."+i);
            if(i>0)
            {
                result="add";
                System.out.println("PRODUCT Record has been updated.");
            }
           
         

            }
        catch(Exception e)
        {
            System.out.println("Exception has been occurred in INSERT PRODUCT method   "+e);
        }
        finally
        {
            return result;
        }
    }
    
    
     public ArrayList getAllCategroyRecords()
    {
       
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList alstCategoryRecords=null;    
          try
            {
                con=DBConnection.dbGetConnection();
                alstCategoryRecords=new ArrayList();
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from p_category");
                while(rs.next())
                {
                    CategoryBean obj=new CategoryBean();
                    obj.setCategory(rs.getString(1));
                    obj.setStatus(rs.getString(2));
                    alstCategoryRecords.add(obj);
                    
                    
                }
            }
      catch(Exception e)
      {
         System.out.println("Error occured in function ArrayList getAllCategroyRecords()"+e);
      }
          finally
          {
            
              return alstCategoryRecords;
          }
      }
      public ArrayList getAllProductRecords()
    {
       
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        ArrayList alstProductRecords=null;    
          try
            {
                con=DBConnection.dbGetConnection();
                alstProductRecords=new ArrayList();
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from product2");
                while(rs.next())
                {
                    ProductBean obj=new ProductBean();
                    obj.setProduct(rs.getString(1));
                    obj.setBrand(rs.getString(2));
                    obj.setCategory(rs.getString(3));
                    obj.setStatus(rs.getString(4));
                    obj.setBarCode(rs.getString(5));
                    obj.setCostPrice(rs.getString(6));
                    obj.setRetailPrice(rs.getString(7));
                    obj.setQty(rs.getString(8));
                   
                    
                    
                    
                    
                    
                    alstProductRecords.add(obj);
                    
                    
                }
            }
      catch(Exception e)
      {
         System.out.println("Error occured in function ArrayList getProductRecords()"+e);
      }
          finally
          {
            
              return alstProductRecords;
          }
      }
      
      
      public ProductBean getProductRecordByBarCode(String  m)
     {
        Connection con=null;
        PreparedStatement pstmt=null;
       
        String result="failed";
        ResultSet rs=null;
        ProductBean bean=null;
        try
        {
            con = DBConnection.dbGetConnection();
            pstmt = con.prepareStatement("select * from product2 where barcode="+m);
            rs = pstmt.executeQuery();
            if(rs.next())
            {      bean= new ProductBean();
                   bean.setProduct(String.valueOf(rs.getString(1)));
                   bean.setBrand(String.valueOf(rs.getString(2)));
                   bean.setCategory(String.valueOf(rs.getString(3)));
                   bean.setStatus(String.valueOf(rs.getString(4)));
                    bean.setBarCode(String.valueOf(rs.getString(5)));
                   bean.setCostPrice(String.valueOf(rs.getString(6)));
                   bean.setRetailPrice(String.valueOf(rs.getString(7)));
                   bean.setQty(String.valueOf(rs.getString(8)));
                   
                      
                      
            }
          
            
           
        
        } 
        catch (Exception e) 
        {
            System.out.println("getProductRecordByBarCode : " + e);
        }
        return bean;
    }
      
      public String deleteProductRecordByBarCode(String  m)
     {
        Connection con=null;
        Statement stmt=null;
       
        String result="failed";
        ResultSet rs=null;
        ProductBean bean=null;
        try
        {
            con = DBConnection.dbGetConnection();
            stmt = con.createStatement();
           int i= stmt.executeUpdate("delete from product2 where barcode="+m);
          
           
           if(i>0)
            {
                result="deleted";
                System.out.println("Record has been deleted.");
            }
            
           
        
        } 
        catch (Exception e) 
        {
            System.out.println("getProductRecordByBarCode : " + e);
        }
        return result;
    }
      public String updateProductRecordByBarCode(ProductBean bean,String  m)
     {
        Connection con=null;
        PreparedStatement pstmt=null;
       
        String result="failed";
        ResultSet rs=null;
      
        try
        {
           con= DBConnection.dbGetConnection();
            String query="update product2 set product=?,brand=?,category=?,status=?,cost_price=?,retail_price=?,qty=? where barcode="+m;
       
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,bean.getProduct());
            pstmt.setString(2,bean.getBrand());
            pstmt.setString(3,bean.getCategory());
            pstmt.setString(4,bean.getStatus());
            pstmt.setString(5,bean.getCostPrice());
            pstmt.setString(6,bean.getRetailPrice());
            pstmt.setString(7,bean.getQty());
         
                
             int i= pstmt.executeUpdate();
               
            if(i>0)
            {
               System.out.println("Record has been updated successfully");
           
               result="updated";
            }
            else
            {
                System.out.println("record is not updated");
            }
           
        
        } 
        catch (Exception e) 
        {
            System.out.println("updateProductRecordByBarCode : " + e);
        }
        return result;
    }
     
     
     
    /**
     *
     * @param bean
     * @return
     */
//    public String addFacultyRecord(FacultyDetailBean bean)
//    {
//        String result="fail";
//        Connection con=null;
//        PreparedStatement pstmt=null;
//        ResultSet rs=null;
//        
//        try
//        {
//            con= DBConnection.dbGetConnection();
//            String query="insert into facdetails values(?,?,?,?,?,?,?,?,?,?)";
//            System.out.println("check-11111.");
//            pstmt=con.prepareStatement(query);
//            pstmt.setInt(1,bean.getFacultyid());
//            pstmt.setString(2,bean.getFacultyname());
//            pstmt.setString(3,bean.getFathername());
//            pstmt.setString(4,bean.getDob());
//            pstmt.setString(5,bean.getGender());
//            pstmt.setString(6,bean.getPhoneno());
//            pstmt.setString(7,bean.getEmailid());
//            pstmt.setString(8,bean.getAddress());
//            pstmt.setString(9,bean.getDepartment());
//            pstmt.setString(10,bean.getSalary());
//             System.out.println("check--2222222.");
//            int i= pstmt.executeUpdate();
//               System.out.println("value of i----------."+i);
//            if(i>0)
//            {
//                result="add";
//                System.out.println("Record has been updated.");
//            }
//           
//         
//
//            }
//        catch(Exception e)
//        {
//            System.out.println("Exception has been occurred in addFaculty method   "+e);
//        }
//        finally
//        {
//            return result;
//        }
//    }
//    public ArrayList getAllFacultyRecords()
//    {
//       
//        Connection con=null;
//        Statement stmt=null;
//        ResultSet rs=null;
//        ArrayList alstFacultyRecords=null;    
//          try
//            {
//                con=DBConnection.dbGetConnection();
//                alstFacultyRecords=new ArrayList();
//                stmt=con.createStatement();
//                rs=stmt.executeQuery("select * from facdetails");
//                while(rs.next())
//                {
//                    FacultyDetailBean obj=new FacultyDetailBean();
//                    obj.setFacultyid(rs.getInt(1));
//                    obj.setFacultyname(rs.getString(2));
//                    obj.setFathername(rs.getString(3));
//                    obj.setDob(rs.getString(4));
//                    obj.setGender(rs.getString(5));
//                    obj.setPhoneno(rs.getString(6));
//                    obj.setEmailid(rs.getString(7));
//                    obj.setAddress(rs.getString(8));
//                    obj.setDepartment(rs.getString(9));
//                    obj.setSalary(rs.getString(10));
//                    alstFacultyRecords.add(obj);
//                    
//                }
//            }
//      catch(Exception e)
//      {
//         System.out.println("Error occured in function ArrayList getOldFacultyRecords()"+e);
//      }
//          finally
//          {
//            System.out.println("size of Arraylist-----"+alstFacultyRecords.size());
//              return alstFacultyRecords;
//          }
//      }
//    public int facultyid()
//    {
//        int facid=0;
//        ResultSet rs=null;
//        Statement start;
//        Connection con=null;
//        try
//        {
//            con=DBConnection.dbGetConnection();
//            start=con.createStatement();
//            rs=start.executeQuery("select * from facultydetail");
//            while(rs.next())
//            {
//                facid=Integer.parseInt(rs.getString(1)) ;   
//                System.out.println("faculty-----"+facid);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("facultyid() "+e);
//        }
//          
//         finally
//           {
//                return facid;
//            }
//    }
//    public String updateRecord(FacultyDetailBean bean, String facultyid)
//            {
//                String result="fail";
//                ResultSet rs=null;
//                 Connection con=null;
//        PreparedStatement pstmt=null;
//        int id=Integer.parseInt(facultyid);
//        try
//        {
//             con= DBConnection.dbGetConnection();
//            String query="update facdetails set fac_id=?,fact_name=?,f_name=?,dob=?,gender=?,ph_no=?,email_id=?,address=?,dept=?,salary=? where fac_id="+id;
//            System.out.println("check-11111.");
//            pstmt=con.prepareStatement(query);
//            pstmt.setInt(1,bean.getFacultyid());
//            pstmt.setString(2,bean.getFacultyname());
//            pstmt.setString(3,bean.getFathername());
//            pstmt.setString(4,bean.getDob());
//            pstmt.setString(5,bean.getGender());
//            pstmt.setString(6,bean.getPhoneno());
//            pstmt.setString(7,bean.getEmailid());
//       
//            pstmt.setString(8,bean.getAddress());
//                 pstmt.setString(9,bean.getDepartment());
//            pstmt.setString(10,bean.getSalary());
//             int i= pstmt.executeUpdate();
//               
//            if(i>0)
//            {
//               System.out.println("Record has been update successfully");
//           
//               result="update";
//            }
//            else
//            {
//                System.out.println("record is not updated");
//            }
//        }
//            catch(Exception e)
//            {
//                System.out.println("recordupdate    "+e);
//            }
//             finally
//        {
//            return result;
//        }
//     }
            
 }
           
         

           
