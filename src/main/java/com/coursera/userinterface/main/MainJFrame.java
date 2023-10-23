/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.coursera.userinterface.main;

import java.awt.CardLayout;
import javax.swing.JPanel;
import main.java.com.coursera.userinterface.authentication.LoginJPanel;
import javax.swing.JPanel;
import main.java.com.coursera.userinterface.authentication.RegistrationJPanel;

/**
 *
 * @author sghar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    //javax.swing.JPanel CardSequencePanel;
    
    public MainJFrame() {
        initComponents();
        //this.CardSequencePanel=csp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainSplitPane = new javax.swing.JSplitPane();
        mainMenuJPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        CardSequencePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setSize(new java.awt.Dimension(1000, 1000));

        MainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        MainSplitPane.setBounds(new java.awt.Rectangle(0, 0, 1000, 800));

        mainMenuJPanel.setMinimumSize(new java.awt.Dimension(800, 300));
        mainMenuJPanel.setPreferredSize(new java.awt.Dimension(200, 1000));
        mainMenuJPanel.setSize(new java.awt.Dimension(300, 1000));

        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuJPanelLayout = new javax.swing.GroupLayout(mainMenuJPanel);
        mainMenuJPanel.setLayout(mainMenuJPanelLayout);
        mainMenuJPanelLayout.setHorizontalGroup(
            mainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuJPanelLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(mainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );
        mainMenuJPanelLayout.setVerticalGroup(
            mainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuJPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnLogin)
                .addGap(26, 26, 26)
                .addComponent(btnRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainSplitPane.setLeftComponent(mainMenuJPanel);

        CardSequencePanel.setPreferredSize(new java.awt.Dimension(800, 800));
        CardSequencePanel.setSize(new java.awt.Dimension(800, 500));
        CardSequencePanel.setLayout(new java.awt.CardLayout());
        MainSplitPane.setRightComponent(CardSequencePanel);

        getContentPane().add(MainSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
            LoginJPanel LoginJPanel;
            LoginJPanel = new LoginJPanel(CardSequencePanel);
            //CardSequencePanel.removeAll();
            CardSequencePanel.add("Login", LoginJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
            RegistrationJPanel RegistrationJPanel;
            RegistrationJPanel = new RegistrationJPanel(CardSequencePanel);
            //CardSequencePanel.removeAll();
            CardSequencePanel.add("Register", RegistrationJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JSplitPane MainSplitPane;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel mainMenuJPanel;
    // End of variables declaration//GEN-END:variables
}
