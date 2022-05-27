/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsinfosystem;

import bean.StudentBean;
import db.DBOperations;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RG
 */
public class StudentDetail extends javax.swing.JPanel {

    /**
     * Creates new form StudentDetail
     */
    ArrayList alst = new ArrayList();
    static StudentBean bean2;
    public StudentDetail() {
        initComponents();
        setVisible(true);
        disable();
        if(alst.size()>0)
        {
        StudentBean bean = (StudentBean)DBOperations.getAllStudentRecord().get(0);
        showRecord(bean);
        }
       
    }
     public void clear()
    {
        txtRegister.setText("");
        txtName.setText("");
        txtFatherName.setText("");
        txtMotherName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        ddDate.setText("");
        rbtnMale.setSelected(false);
        rbtnFemale.setSelected(false);
        chkSports.setSelected(false);
        chkcultural.setSelected(false);
        chkOthers.setSelected(false);
        txtPinCode.setText("");
        txtFee.setText("");
    }
     public void disable()
     {
          txtName.setEditable(false);
        txtFatherName.setEditable(false);
        txtMotherName.setEditable(false);
        txtAddress.setEditable(false);
        txtContact.setEditable(false);
        ddDate.setEnabled(false);
        rbtnMale.setEnabled(false);
        rbtnFemale.setEnabled(false);
        chkSports.setEnabled(false);
        chkcultural.setEnabled(false);
        chkOthers.setEnabled(false);
        txtPinCode.setEditable(false);
        txtFee.setEditable(false);
     }
     public void enable()
     {

        txtName.setEditable(true);
        txtFatherName.setEditable(true);
        txtMotherName.setEditable(true);
        txtAddress.setEditable(true);
        txtContact.setEditable(true);
        ddDate.setEnabled(true);
        rbtnMale.setEnabled(true);
        rbtnFemale.setEnabled(true);
        chkSports.setEnabled(true);
        chkcultural.setEnabled(true);
        chkOthers.setEnabled(true);
        txtPinCode.setEditable(true);
        txtFee.setEditable(true);
     }
     
     public void getValues()
     {
          String regNo = txtRegister.getText();
        String name = txtName.getText();
        String f_name = txtFatherName.getText(); 
        String m_name = txtMotherName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();
        String dob = ddDate.getText();
        String gender="";
        if(rbtnMale.isSelected())
        {
            gender="male";
        }
        else
        {
            gender="female";
        }
        String city = (String) ddlCity.getSelectedItem();
       String course = (String) ddlCourse.getSelectedItem();
       
       Boolean sports = chkSports.isSelected();
       Boolean cultural = chkcultural.isSelected();
       Boolean others = chkOthers.isSelected();
       
    
        String transport="";
        if(rbtnYes.isSelected())
        {
            transport="yes";
        }
        else
        {
             transport="no";
        }
       String pin = txtPinCode.getText();
       String fee = txtFee.getText();
       
         bean2 = new StudentBean();
        bean2.setRegNo(Integer.parseInt(regNo));
        bean2.setSt_name(name);
        bean2.setM_name(m_name);
        bean2.setF_name(f_name);
        bean2.setAddress(address);
        bean2.setContact(contact);
        bean2.setDob(dob);
        bean2.setGender(gender);
        bean2.setCity(city);
        bean2.setCourse(course);
        bean2.setSports(sports);
        bean2.setCultural(cultural);
        bean2.setOther(others);
        bean2.setTransport(transport);
        bean2.setFees(fee);
        bean2.setPin(pin);
     }
     
     public void showRecord(StudentBean bean)
     {
     
         txtRegister.setText(""+bean.getRegNo());
        txtName.setText(bean.getSt_name());
        txtFatherName.setText(bean.getF_name());
        txtMotherName.setText(bean.getM_name());
        txtAddress.setText(bean.getAddress());
        txtContact.setText(bean.getContact());
        ddDate.setText(bean.getDob());
        if(bean.getGender().equals("male"))
        {
            rbtnMale.setSelected(true);
             rbtnFemale.setSelected(false);
        }
        else
        {
             rbtnFemale.setSelected(true);
                 rbtnMale.setSelected(false);
        }
        
       if(bean.getSports())
       {
           chkSports.setSelected(true);
       }
       if(bean.getCultural())
       {
            chkcultural.setSelected(true);
       }
       if(bean.getOther())
       {
            chkOthers.setSelected(true);
       }
       
        if(bean.getTransport().equals("yes"))
        {
            rbtnYes.setSelected(true);
             rbtnNo.setSelected(false);
        }
        else
        {
               rbtnYes.setSelected(false);
             rbtnNo.setSelected(true);
        }
        
       
       
        txtPinCode.setText(bean.getPin());
        txtFee.setText(bean.getFees());
     }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ddlCourse = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        rbtnNo = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        chkSports = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtRegister = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        ddDate = new datechooser.beans.DateChooserCombo();
        jLabel12 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        rbtnFemale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnPrevious = new javax.swing.JButton();
        ddlCity = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPinCode = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        chkOthers = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        chkcultural = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        rbtnYes = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "STUDENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 51, 255));
        jPanel1.setToolTipText("");

        jLabel2.setText("Student Name");

        ddlCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mohali", "Patiala", "Rajpura", "panipat", "chandigrah", "patiala", "Hisar", "Ganganagar", " " }));

        jLabel14.setText("Fees");

        buttonGroup2.add(rbtnNo);
        rbtnNo.setText("No");

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        chkSports.setText("Sports");

        jLabel1.setText("Registration No");

        jLabel8.setText("Gender");

        jLabel12.setText("Transport ");

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setText("Female");

        jLabel3.setText("Father Name");

        buttonGroup1.add(rbtnMale);
        rbtnMale.setText("Male");

        jLabel5.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        ddlCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "BBA", "B.SC(IT)", "M.sc(IT)", "MCA", "B.COM" }));

        jLabel9.setText("City");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        chkOthers.setText("Others");

        jLabel10.setText("Course");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        chkcultural.setText("Cultural");

        jLabel13.setText("Pin Code");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Contact");

        jLabel6.setText("Date of Birth");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Mother Name");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtnYes);
        rbtnYes.setText("Yes");

        jLabel11.setText("Activities");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(rbtnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnFemale)
                        .addGap(406, 406, 406))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel8)
                                    .addComponent(btnAdd)
                                    .addComponent(btnFirst))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRegister, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMotherName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(114, 146, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14))
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(51, 51, 51)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(ddlCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(ddlCourse, 0, 120, Short.MAX_VALUE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(43, 43, 43))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addGap(36, 36, 36)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(chkOthers)
                                                            .addComponent(chkSports)
                                                            .addComponent(chkcultural)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(rbtnYes)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rbtnNo)))
                                                        .addGap(20, 20, 20)))
                                                .addGap(29, 29, 29)))))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ddlCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ddlCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(chkSports))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkOthers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkcultural, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rbtnYes)
                            .addComponent(rbtnNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ddDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnMale)
                        .addComponent(rbtnFemale)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnEdit))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnLast)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        getValues();
        DBOperations db = new DBOperations();
        String result = db.insertStudentRecord(bean2);
        
        if(result.equals("valid"))
        {
              JOptionPane.showMessageDialog(null, "Record is inserted");
          
              disable();
        }
       
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        clear();
        DBOperations obj = new DBOperations();
        int id=obj.getMAxRegId();
        txtRegister.setText(""+(id+1));
        txtRegister.disable();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        StudentBean bean = DBOperations.getFirstRecord();
         showRecord(bean);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        int id= Integer.parseInt(txtRegister.getText())+1;
         StudentBean bean = DBOperations.getRecordById(id);
         showRecord(bean);
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
         int id= Integer.parseInt(txtRegister.getText())-1;
        
         if(id>0)
         {
             StudentBean bean = DBOperations.getRecordById(id);
              showRecord(bean);
         }
         
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
            int id= DBOperations.getMAxRegId();
        
         if(id>0)
         {
             StudentBean bean = DBOperations.getRecordById(id);
              showRecord(bean);
         }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        enable();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        getValues();
        int id = Integer.parseInt(txtRegister.getText());
       String result= DBOperations.updateStudentRecordById(bean2, id);
        if(result.equals("valid"))
        {
              JOptionPane.showMessageDialog(null, "Record is updated");
          
              disable();
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkOthers;
    private javax.swing.JCheckBox chkSports;
    private javax.swing.JCheckBox chkcultural;
    private datechooser.beans.DateChooserCombo ddDate;
    private javax.swing.JComboBox<String> ddlCity;
    private javax.swing.JComboBox<String> ddlCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnYes;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtRegister;
    // End of variables declaration//GEN-END:variables
}
