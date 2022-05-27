/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import bean.AddStudentBean;
import bean.RoomBean;
import db.DBOperations;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author RG
 */
public class AddNewStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddNewStudent
     */
    
  String[] room=null;
    public AddNewStudent() {
        initComponents();
        setVisible(true);
        setSize(500,500);
        setBounds(450,130, 500,500);
     
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        DBOperations db = new DBOperations();
        
      
       ArrayList alst =db.getAllRoomRecord();
       if(alst.size()>0)
       {
             room = new String[alst.size()];
            for(int i=0;i<alst.size();i++)
            {
             RoomBean   bean = (RoomBean)alst.get(i);
     
                if(bean.getStatus()==false)
                {
                         ddlRoom.addItem(bean.getRoomNo());
                }
            

            }   
       }
      
    
        
        
    
        
        
    }
    
    public void clear()
    {
         
        txtID.setText("");
        txtName.setText("");
       txtF_name.setText("");
         txtM_name.setText("");
       txtEmail.setText("");
        
         txtAddress.setText("");
        txtCollege.setText("");
         txtAdhar.setText("");
         txtMobile.setText("");
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtM_name = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCollege = new javax.swing.JTextField();
        txtF_name = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtAdhar = new javax.swing.JTextField();
        ddlRoom = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 313, 100, 14);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 43, 70, 14);

        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(33, 81, 90, 14);

        jLabel4.setText("Mother Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 125, 100, 14);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(33, 163, 60, 14);

        jLabel6.setText("Permanet Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(33, 199, 110, 14);

        jLabel7.setText("College Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(33, 237, 90, 14);

        jLabel8.setText("Adhar Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(33, 275, 100, 14);

        jLabel9.setText("Room No");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(33, 342, 70, 14);
        getContentPane().add(txtName);
        txtName.setBounds(236, 40, 138, 20);
        getContentPane().add(txtM_name);
        txtM_name.setBounds(236, 122, 138, 20);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(236, 160, 138, 20);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(236, 196, 138, 20);
        getContentPane().add(txtCollege);
        txtCollege.setBounds(236, 234, 138, 20);
        getContentPane().add(txtF_name);
        txtF_name.setBounds(236, 78, 138, 20);
        getContentPane().add(txtMobile);
        txtMobile.setBounds(236, 310, 138, 20);
        getContentPane().add(txtAdhar);
        txtAdhar.setBounds(236, 272, 138, 20);

        getContentPane().add(ddlRoom);
        ddlRoom.setBounds(236, 339, 138, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(33, 388, 110, 29);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clear.png"))); // NOI18N
        jButton2.setText("Clear");
        getContentPane().add(jButton2);
        jButton2.setBounds(241, 388, 107, 29);

        jLabel11.setText("ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 10, 11, 14);
        getContentPane().add(txtID);
        txtID.setBounds(240, 10, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String id = txtID.getText();
        String name = txtName.getText();
        String f_name = txtF_name.getText();
        String m_name = txtM_name.getText();
        String email = txtEmail.getText();
        
        String address = txtAddress.getText();
        String college = txtCollege.getText();
        String adhar = txtAdhar.getText();
        String mobile = txtMobile.getText();
        String room1 = (String)ddlRoom.getSelectedItem();
        

        AddStudentBean bean= new AddStudentBean();
        bean.setSt_id(id);
        bean.setName(name);
        bean.setF_name(f_name);
        bean.setM_name(m_name);
        bean.setEmail(email);
        bean.setAddress(address);
        bean.setCollege(college);
        bean.setAdhar(adhar);
        bean.setContact(mobile);
        bean.setRoom_no(room1);
        
        DBOperations obj = new DBOperations();
        String result=obj.insertstudentRecord(bean);
        if(result.equals("valid"))
        {
           JOptionPane.showMessageDialog(null,"Student detail Is inserted ");
           clear();
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ddlRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAdhar;
    private javax.swing.JTextField txtCollege;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtF_name;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtM_name;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}