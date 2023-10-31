/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.authentication;

import javax.swing.JPanel;
import main.java.com.coursera.usermanagement.UserList;

/**
 *
 * @author sghar
 */
public class RegisterMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterMenuJPanel
     */
    private JPanel CardSequencePanel;
    private UserList ulist;  // Add a UserList variable here

    public RegisterMenuJPanel(JPanel rmjp, UserList ulist) {
        this.CardSequencePanel = rmjp;
        this.ulist = ulist; // Assign the ulist parameter to the class variable
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStudent = new javax.swing.JButton();
        btnProfessor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnStudent.setBackground(new java.awt.Color(212, 31, 47));
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnProfessor.setBackground(new java.awt.Color(212, 31, 47));
        btnProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btnProfessor.setText("Professor");
        btnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        StudentRegistrationJPanel studentRegistration;
        studentRegistration = new StudentRegistrationJPanel(CardSequencePanel, ulist );
        //CardSequencePanel.removeAll();
        CardSequencePanel.add("Register", studentRegistration);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorActionPerformed
        // TODO add your handling code here:
        ProfessorRegistrationJPanel professorRegistration;
        professorRegistration = new ProfessorRegistrationJPanel(CardSequencePanel, ulist);
        //CardSequencePanel.removeAll();
        CardSequencePanel.add("Register", professorRegistration);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnProfessorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfessor;
    private javax.swing.JButton btnStudent;
    // End of variables declaration//GEN-END:variables
}
