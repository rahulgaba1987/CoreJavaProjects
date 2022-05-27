/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facultyinformation;

import java.awt.Container;
import java.awt.Toolkit;

/**
 *
 * @author neenadevi
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    static Container c;
    public MainFrame() {
        initComponents();
        c=getContentPane();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
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
        jMenu2 = new javax.swing.JMenu();
        menuItemFacultyDetail = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemAboutUs = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Faculty");

        menuItemFacultyDetail.setText("FacultyDetails");
        menuItemFacultyDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFacultyDetailActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemFacultyDetail);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Contact Us");

        menuItemAboutUs.setText("About Us");
        menuItemAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemAboutUs);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("General Info");

        jMenuItem1.setText("College Info");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemFacultyDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFacultyDetailActionPerformed
        // TODO add your handling code here:
        c.removeAll();
        FacultyDetail obj=new FacultyDetail();
        obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);
        
    }//GEN-LAST:event_menuItemFacultyDetailActionPerformed

    private void menuItemAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAboutUsActionPerformed
        // TODO add your handling code here:
        c.removeAll();
        AboutUs obj = new AboutUs();
        obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);

    }//GEN-LAST:event_menuItemAboutUsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
               c.removeAll();
        GeneralInfo obj = new GeneralInfo();
        obj.setBounds(300,20,800,700);
        c.add(obj);
        c.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuItemAboutUs;
    private javax.swing.JMenuItem menuItemFacultyDetail;
    // End of variables declaration//GEN-END:variables
}
