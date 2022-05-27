/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsystem;

import bean.AddStudentBean;
import bean.RoomBean;
import bean.StudentUpdateBean;
import db.DBOperations;
import javax.swing.JOptionPane;

/**
 *
 * @author RG
 */
public class StudentUpdate extends javax.swing.JFrame {

    /**
     * Creates new form StudentUpdate
     * V
     */
    AddStudentBean bean=null;
    public StudentUpdate() {
        initComponents();
          setVisible(true);
        setSize(500,500);
        setBounds(450,130, 500,500);
     
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        jLabel10 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtMother = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCollege = new javax.swing.JTextField();
        txtAdhar = new javax.swing.JTextField();
        txtRoom = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        ddlStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Mobile Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(74, 40, 86, 14);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(74, 82, 100, 14);

        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(74, 117, 100, 14);

        jLabel4.setText("Mother Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(74, 158, 100, 14);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(74, 196, 100, 14);

        jLabel6.setText("Permannent Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(74, 236, 100, 14);

        jLabel7.setText("College Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(74, 274, 100, 14);

        jLabel8.setText("Adhar Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(74, 312, 100, 14);

        jLabel9.setText("Room Number");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(74, 350, 100, 14);

        jLabel10.setText("Living Status");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(74, 388, 100, 14);
        getContentPane().add(txtMobile);
        txtMobile.setBounds(236, 37, 137, 20);
        getContentPane().add(txtMother);
        txtMother.setBounds(236, 155, 137, 20);
        getContentPane().add(txtName);
        txtName.setBounds(236, 79, 137, 20);
        getContentPane().add(txtFatherName);
        txtFatherName.setBounds(236, 117, 137, 20);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(236, 233, 137, 20);
        getContentPane().add(txtCollege);
        txtCollege.setBounds(236, 271, 137, 20);
        getContentPane().add(txtAdhar);
        txtAdhar.setBounds(236, 309, 137, 20);
        getContentPane().add(txtRoom);
        txtRoom.setBounds(236, 347, 137, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(236, 193, 137, 20);

        ddlStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Living", "Non-living", " " }));
        getContentPane().add(ddlStatus);
        ddlStatus.setBounds(236, 385, 137, 20);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(74, 423, 67, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(236, 423, 90, 23);

        txtClear.setText("Clear");
        getContentPane().add(txtClear);
        txtClear.setBounds(358, 423, 70, 23);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(390, 30, 110, 29);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pages background.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-10, 0, 520, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try
        {
             String m_no = txtMobile.getText();
        db.DBOperations obj = new DBOperations();
        bean = (AddStudentBean)obj.getStudentRecordByMobile(m_no);
        if(bean!=null)
        {
             txtName.setText(bean.getName());
        txtFatherName.setText((bean.getF_name()));
        txtMother.setText(bean.getM_name());
        txtEmail.setText(bean.getEmail());
        txtAddress.setText(bean.getAddress());
        txtCollege.setText(bean.getCollege());
        txtAdhar.setText(bean.getAdhar());
        txtRoom.setText(bean.getRoom_no());
        RoomBean b1=obj.getRoomById(bean.getRoom_no());
       
        if(b1.getStatus())
        {
            ddlStatus.setSelectedIndex(0);
        }
        else
        {
            ddlStatus.setSelectedIndex(1);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Mobile number does not exist");
        }
       
        
        }
        catch(Exception e)
        {
            System.out.println("Exception is occured in student update frame ");
        }
       
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        try
        {
             String mobile = txtMobile.getText();
          String name=txtName.getText();
        String f_name=txtFatherName.getText();
        String m_name=txtMother.getText();
       String email= txtEmail.getText();
       String address= txtAddress.getText();
        String college =txtCollege.getText();
        String adhar=txtAdhar.getText();
        String room=txtRoom.getText();
        String status = ddlStatus.getSelectedItem().toString();
        
        StudentUpdateBean stbean = new StudentUpdateBean();
        stbean.setId(Integer.parseInt(bean.getSt_id()));
        stbean.setMobile(mobile);
        stbean.setName(name);
        stbean.setFather(f_name);
        stbean.setMother(m_name);
        stbean.setEmail(email);
        stbean.setAddress(address);
        stbean.setCollege(college);
        stbean.setAdhar(adhar);
        stbean.setRoom(room);
        stbean.setStatus(status);
        
        DBOperations d= new DBOperations();
        String resut=d.updateStudentRecord(stbean);
        if(resut.equals("updated"))
        {
            JOptionPane.showConfirmDialog(null,"Record is updated ");
        }
       
        
        }
        catch(Exception e)
        {
            System.out.println("Exception is occurred in update student on frame  "+e);
        }
       
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> ddlStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton txtClear;
    private javax.swing.JTextField txtCollege;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtMother;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoom;
    // End of variables declaration//GEN-END:variables
}
