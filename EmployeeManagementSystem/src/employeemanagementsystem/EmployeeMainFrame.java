/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import java.awt.Container;
import java.awt.Toolkit;

/**
 *
 * @author RG
 */
public class EmployeeMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeMainFrame
     */
    Container c=null;
    public EmployeeMainFrame() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
        c=getContentPane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemPersonalDetail = new javax.swing.JMenuItem();
        menuItemBanklDetail = new javax.swing.JMenuItem();
        menuItemBankDetail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        menuItemExit.setText("Exit");
        jMenu1.add(menuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Detail");

        menuItemPersonalDetail.setText("Personal Detail");
        menuItemPersonalDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPersonalDetailActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemPersonalDetail);

        menuItemBanklDetail.setText("Emp Bank Deatil");
        menuItemBanklDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBanklDetailActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemBanklDetail);

        menuItemBankDetail.setText("Leave Detail");
        menuItemBankDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBankDetailActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemBankDetail);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Contact US");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemBankDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBankDetailActionPerformed
        // TODO add your handling code here:
         c.removeAll();
        LeaveDetail obj = new LeaveDetail();
         obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_menuItemBankDetailActionPerformed

    private void menuItemPersonalDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPersonalDetailActionPerformed
        // TODO add your handling code here:
        
        c.removeAll();
        PersonalDetail obj = new PersonalDetail();
         obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);
        
    }//GEN-LAST:event_menuItemPersonalDetailActionPerformed

    private void menuItemBanklDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBanklDetailActionPerformed
        // TODO add your handling code here:
         c.removeAll();
        BankDetail obj = new BankDetail();
         obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_menuItemBanklDetailActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemBankDetail;
    private javax.swing.JMenuItem menuItemBanklDetail;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemPersonalDetail;
    // End of variables declaration//GEN-END:variables
}