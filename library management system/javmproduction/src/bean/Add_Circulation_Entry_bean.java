/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author bcpbi1130
 */
public class Add_Circulation_Entry_bean {
 
    
    private  String Date_of_Issued,Date_of_Return,Book_Name,Student_Name,Student_Class,Book_Received;
     
    private int Book_ID,Student_RollNo,Total_Fine;

    public String getDate_of_Issued() {
        return Date_of_Issued;
    }

    public void setDate_of_Issued(String Date_of_Issued) {
        this.Date_of_Issued = Date_of_Issued;
    }

    public String getDate_of_Return() {
        return Date_of_Return;
    }

    public void setDate_of_Return(String Date_of_Return) {
        this.Date_of_Return = Date_of_Return;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String Book_Name) {
        this.Book_Name = Book_Name;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
    }

    public String getStudent_Class() {
        return Student_Class;
    }

    public void setStudent_Class(String Student_Class) {
        this.Student_Class = Student_Class;
    }

    public String getBook_Received() {
        return Book_Received;
    }

    public void setBook_Received(String Book_Received) {
        this.Book_Received = Book_Received;
    }

    public int getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(int Book_ID) {
        this.Book_ID = Book_ID;
    }

    public int getStudent_RollNo() {
        return Student_RollNo;
    }

    public void setStudent_RollNo(int Student_RollNo) {
        this.Student_RollNo = Student_RollNo;
    }

    public int getTotal_Fine() {
        return Total_Fine;
    }

    public void setTotal_Fine(int Total_Fine) {
        this.Total_Fine = Total_Fine;
    }
    
}
