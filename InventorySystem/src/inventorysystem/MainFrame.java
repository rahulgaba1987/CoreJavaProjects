/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import bean.CategoryBean;
import bean.ProductBean;
import db.CommonServices;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author RG
 */
public class MainFrame extends javax.swing.JFrame {

    CommonServices com;
    ArrayList alst=null;
    
    ArrayList alstProduct=null;
        ArrayList alstProduct2=null;
     String header[]={"Category","Status"};
      String header2[]={"Product","Brand","|Category","Status","Bar code", "Cost Price","Retail Price","Quantity"};
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setSize(1200,700);
      
          setLocationRelativeTo(null);
          com= new CommonServices();
          alstProduct2= com.getAllCategroyRecords();
          if(alstProduct2.size()>0)
          {
              for(int i=0;i<alstProduct2.size();i++)
              {
                  CategoryBean b = (CategoryBean)alstProduct2.get(i);
                  ddlCategory.addItem(b.getCategory());
                  ddlStatus.addItem(b.getStatus());
              }
              
          }
          displayCategoryRecord();
          displayProductRecord();
    }
    public void displayCategoryRecord()
    {
       
       alst = new ArrayList();
        alst = com.getAllCategroyRecords();
     
        if(alst.size()>0)
        {
          
            Object data[][] = new Object[alst.size()][2];
            for(int i=0;i<alst.size();i++)
            {  CategoryBean bean1 = (CategoryBean)alst.get(i);
                data[i][0]= bean1.getCategory();
                data[i][1]= bean1.getStatus();
               
                  
            }
         DefaultTableModel model = new DefaultTableModel(data, header);
            
         tblCategory.setModel(model);
            
        }
    }
    public void clear()
    {
        txtProduct.setText("");
        txtBarCode.setText("");
        txtCostPrice.setText("");
        txtRetailPrice.setText("");
        txtQty.setText("");
        
    }
    public void displayProductRecord()
    {
       
       alstProduct = new ArrayList();
        alstProduct = com.getAllProductRecords();
     
        if(alstProduct.size()>0)
        {
          
            Object data[][] = new Object[alstProduct.size()][8];
            for(int i=0;i<alstProduct.size();i++)
            { 
                ProductBean bean1 = (ProductBean)alstProduct.get(i);
                data[i][0]= bean1.getProduct();
                data[i][1]= bean1.getBrand();
                data[i][2]= bean1.getCategory();
                data[i][3]= bean1.getStatus();
                data[i][4]= bean1.getBarCode();
                data[i][5]= bean1.getCostPrice();
                data[i][6]= bean1.getRetailPrice();
                data[i][7]= bean1.getQty();
               
                  
            }
         DefaultTableModel model = new DefaultTableModel(data, header2);
            
         tblProduct.setModel(model);
            
        }
    }
    public void clear1()
    {
          txtProduct.setText("");
 
         txtBarCode.setText("");
        txtCostPrice.setText("");
          txtRetailPrice.setText("");
        txtQty.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        ddlStatusCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        ddlCategory = new javax.swing.JComboBox<>();
        ddlStatus = new javax.swing.JComboBox<>();
        ddlBrand = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBarCode = new javax.swing.JTextField();
        txtRetailPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtCostPrice = new javax.swing.JTextField();
        btnUpdateProduct = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Category");

        btnUpdate.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdate.setText("Update");

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblCategory);

        btnAdd.setBackground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        ddlStatusCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        jLabel2.setText("Status");

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddlStatusCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ddlStatusCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(43, 43, 43)
                        .addComponent(btnDelete)
                        .addGap(44, 44, 44)
                        .addComponent(btnUpdate)
                        .addGap(57, 57, 57))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Category", jPanel1);

        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Product");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(42, 73, 80, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Brand");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(42, 119, 70, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Category");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(42, 164, 70, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Status");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 210, 60, 17);
        jPanel3.add(txtProduct);
        txtProduct.setBounds(190, 70, 168, 20);

        jPanel3.add(ddlCategory);
        ddlCategory.setBounds(190, 160, 170, 20);

        ddlStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlStatusActionPerformed(evt);
            }
        });
        jPanel3.add(ddlStatus);
        ddlStatus.setBounds(190, 210, 170, 20);

        ddlBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addidas", "Cello", "Sketcher", "Addidas", "Rebok", "LG", "Samsung" }));
        jPanel3.add(ddlBrand);
        ddlBrand.setBounds(190, 120, 168, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Bar Code");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(439, 73, 70, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Cost Price");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(439, 119, 80, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Retail Price");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(440, 170, 70, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Qty");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(440, 210, 60, 17);
        jPanel3.add(txtBarCode);
        txtBarCode.setBounds(580, 70, 170, 20);
        jPanel3.add(txtRetailPrice);
        txtRetailPrice.setBounds(580, 120, 170, 20);
        jPanel3.add(txtQty);
        txtQty.setBounds(580, 210, 170, 20);
        jPanel3.add(txtCostPrice);
        txtCostPrice.setBounds(580, 170, 170, 20);

        btnUpdateProduct.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdateProduct.setText("Update");
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdateProduct);
        btnUpdateProduct.setBounds(840, 140, 150, 23);

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(840, 200, 150, 23);

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(840, 80, 150, 23);

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product", "Brand", "Category", "Status", "Bar Code", "Cost Price", "Retail Price", "Qty"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 361, 1117, 304);

        jTabbedPane1.addTab("Product", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddlStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlStatusActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String category = txtCategory.getText();
        String status = (String)ddlStatusCategory.getSelectedItem();
        CategoryBean bean = new CategoryBean();
        bean.setCategory(category);
        bean.setStatus(status);
        
        String result=com.insertCategoryDetail(bean);
        
        if(result.equals("add"))
             {
                 JOptionPane.showMessageDialog(this,"Category is inserted");
                 displayCategoryRecord();
               
             }
             else
             {
                 System.out.println("Category is not inserted");
             }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();
        if(tblCategory.getSelectedRowCount()==1)
        {
           // model.removeRow(tblCategory.getSelectedRow());
            
            
        }
        else
        {
            if(tblCategory.getSelectedRowCount()==0)
            {
                 JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else
            {
                 JOptionPane.showMessageDialog(this,"Please select any single row to delete");
            }
           
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String product = txtProduct.getText();
        String brand =(String) ddlBrand.getSelectedItem();
        String category = (String) ddlCategory.getSelectedItem();
        String status=(String) ddlBrand.getSelectedItem();
        String barcode = txtBarCode.getText();
        String costPrice = txtCostPrice.getText();
         String retailPrice = txtRetailPrice.getText();
         String qty = txtQty.getText();
         
         ProductBean bean = new ProductBean();
         bean.setProduct(product);
         bean.setBrand(brand);
         bean.setCategory(category);
         bean.setStatus(status);
         bean.setBarCode(barcode);
         bean.setCostPrice(costPrice);
         bean.setRetailPrice(retailPrice);
         bean.setQty(qty);
         
         String result=com.insertProductDetail(bean);
         if(result.equals("add"))
         {
                 JOptionPane.showMessageDialog(this,"Product detail is inserted");
                displayProductRecord();
                clear();
                  txtBarCode.setEditable(true);
              
         }
         else
         {
                 System.out.println("Product detail is not inserted");
         }
         
         
         
         
         
         
         
         
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();
        if(tblProduct.getSelectedRowCount()==1)
        {
           String bar=txtBarCode.getText();
           String result=com.deleteProductRecordByBarCode(bar);
           if(result.equals("deleted"))
             {
                 JOptionPane.showMessageDialog(this,"Product is Deleted");
                 clear1();
                 
                 displayProductRecord();
                  txtBarCode.setEditable(true);
               
             }
             else
             {
                 System.out.println("Product is Deleted");
             }
            
            
        }
        else if(tblProduct.getSelectedRowCount()==0)
        {
                 JOptionPane.showMessageDialog(this,"Please select any single row to delete");
        }
          
            
           
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
         txtBarCode.setEditable(false);
        int rowNo=tblProduct.getSelectedRow();
        TableModel model = tblProduct.getModel();
        String barcode = model.getValueAt(rowNo,4).toString();
       txtBarCode.setText(barcode);
       
       ProductBean bean =com.getProductRecordByBarCode(barcode);
         txtProduct.setText(bean.getProduct());
         ddlBrand.setSelectedItem(bean.getBrand());
         ddlCategory.setSelectedItem(bean.getCategory()); 
         ddlStatus.setSelectedItem(bean.getStatus());
         txtCostPrice.setText(bean.getCostPrice());
         txtRetailPrice.setText(bean.getRetailPrice());
         txtQty.setText(bean.getQty());
          
        
       
        
       
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();
        if(tblProduct.getSelectedRowCount()==1)
        {
            
            String product = txtProduct.getText();
        String brand =(String) ddlBrand.getSelectedItem();
        String category = (String) ddlCategory.getSelectedItem();
        String status=(String) ddlBrand.getSelectedItem();
        String barcode = txtBarCode.getText();
        String costPrice = txtCostPrice.getText();
         String retailPrice = txtRetailPrice.getText();
         String qty = txtQty.getText();
         
         ProductBean bean = new ProductBean();
         bean.setProduct(product);
         bean.setBrand(brand);
         bean.setCategory(category);
         bean.setStatus(status);
         bean.setBarCode(barcode);
         bean.setCostPrice(costPrice);
         bean.setRetailPrice(retailPrice);
         bean.setQty(qty);
          
           String result=com.updateProductRecordByBarCode(bean,barcode);
           if(result.equals("updated"))
             {
                 JOptionPane.showMessageDialog(this,"Product is Updated");
                 clear1();
                 
                 displayProductRecord();
               
             }
             else
             {
                 System.out.println("Product is Updated");
             }
            
            
        }
        else if(tblProduct.getSelectedRowCount()==0)
        {
                 JOptionPane.showMessageDialog(this,"Please select any single row to delete");
        }
        
        
        
    }//GEN-LAST:event_btnUpdateProductActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<String> ddlBrand;
    private javax.swing.JComboBox<String> ddlCategory;
    private javax.swing.JComboBox<String> ddlStatus;
    private javax.swing.JComboBox<String> ddlStatusCategory;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtBarCode;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRetailPrice;
    // End of variables declaration//GEN-END:variables
}
