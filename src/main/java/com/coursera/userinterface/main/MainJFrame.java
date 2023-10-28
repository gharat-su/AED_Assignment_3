/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.coursera.userinterface.main;


import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.userinterface.authentication.LoginJPanel;
import main.java.com.coursera.userinterface.authentication.RegisterMenuJPanel;
import main.java.com.coursera.usermanagement.UserList;

/**
 *
 * @author sghar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    //javax.swing.JPanel CardSequencePanel;
    private UserList ulist;  // Add a UserList variable here
    private AuthManager authManager; // Add AuthManager
    public MainJFrame() {
        initComponents();
        this.ulist = new UserList();
         this.authManager = new AuthManager(ulist);
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
        setSize(new java.awt.Dimension(1000, 1000));

        MainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainMenuJPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainMenuJPanel.setMinimumSize(new java.awt.Dimension(800, 100));
        mainMenuJPanel.setPreferredSize(new java.awt.Dimension(800, 100));

        btnLogin.setBackground(new java.awt.Color(204, 0, 0));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(204, 0, 0));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(mainMenuJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        mainMenuJPanelLayout.setVerticalGroup(
            mainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mainMenuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MainSplitPane.setLeftComponent(mainMenuJPanel);

        CardSequencePanel.setBackground(new java.awt.Color(255, 255, 255));
        CardSequencePanel.setPreferredSize(new java.awt.Dimension(800, 800));
        CardSequencePanel.setLayout(new java.awt.CardLayout());
        MainSplitPane.setRightComponent(CardSequencePanel);

        getContentPane().add(MainSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
            LoginJPanel LoginJPanel;
            LoginJPanel = new LoginJPanel(CardSequencePanel,authManager,ulist);
            //CardSequencePanel.removeAll();
            CardSequencePanel.add("Login", LoginJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
            RegisterMenuJPanel registerMenu;
            registerMenu = new RegisterMenuJPanel(CardSequencePanel,ulist);
            //CardSequencePanel.removeAll();
            CardSequencePanel.add("Register", registerMenu);
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
