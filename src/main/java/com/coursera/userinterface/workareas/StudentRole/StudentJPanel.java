/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.StudentRole;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JPanel;
import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.userinterface.authentication.LoginJPanel;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.User;

/**
 *
 * @author pradnyashinde
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    javax.swing.JPanel CardSequencePanel;
    private CourseList courseList;
    private UserList ulist;
    private CourseList clist;
    private AuthManager authManager;
    private User loggedInUser;
    
    public StudentJPanel(JPanel csp,CourseList courseList, UserList userList, AuthManager authManager) {
        this.CardSequencePanel=csp;
        initComponents();
       this.clist = courseList;
        this.ulist = userList;
        this.authManager = authManager;
        this.courseList=courseList;
        this.loggedInUser = authManager.getLoggedInUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchStudent = new javax.swing.JButton();
        btnCourseReg = new javax.swing.JButton();
        btnRateProf = new javax.swing.JButton();
        btnBacklog = new javax.swing.JButton();
        btnGraduate = new javax.swing.JButton();
        btnViewCourse = new javax.swing.JButton();

        btnSearchStudent.setText("Search ");
        btnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentActionPerformed(evt);
            }
        });

        btnCourseReg.setText("Register for Course");
        btnCourseReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseRegActionPerformed(evt);
            }
        });

        btnRateProf.setText("Rate Professor");
        btnRateProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateProfActionPerformed(evt);
            }
        });

        btnBacklog.setText("<<Back");
        btnBacklog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacklogActionPerformed(evt);
            }
        });

        btnGraduate.setText("Graduate?");
        btnGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduateActionPerformed(evt);
            }
        });

        btnViewCourse.setText("My Courses");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRateProf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCourseReg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBacklog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(btnViewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBacklog)
                    .addComponent(btnViewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnCourseReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnRateProf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
        // TODO add your handling code here:
            SearchJPanel SearchJPanel;
            SearchJPanel = new SearchJPanel(CardSequencePanel,courseList,loggedInUser);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Search", SearchJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void btnRateProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateProfActionPerformed
        // TODO add your handling code here:
            RateProfessorJPanel RateProfessorJPanel;
            RateProfessorJPanel = new RateProfessorJPanel(CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Professor", RateProfessorJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnRateProfActionPerformed

    private void btnCourseRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseRegActionPerformed
        // TODO add your handling code here:
            StudentRegisterCourseJPanel StudentRegisterCourseJPanel;
            StudentRegisterCourseJPanel = new StudentRegisterCourseJPanel(CardSequencePanel,courseList,loggedInUser);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Course", StudentRegisterCourseJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnCourseRegActionPerformed

    private void btnBacklogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacklogActionPerformed
        // TODO add your handling code here:
            CardSequencePanel.remove(this); // Remove the current panel
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel); // Show the previous panel
    }//GEN-LAST:event_btnBacklogActionPerformed

    private void btnGraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduateActionPerformed
        // TODO add your handling code here:
            GraduatedJPanel GraduatedJPanel;
            GraduatedJPanel = new GraduatedJPanel(CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Transcript", GraduatedJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnGraduateActionPerformed

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        // TODO add your handling code here:
            ViewCoursesJPanel ViewCoursesJPanel;
            ViewCoursesJPanel = new ViewCoursesJPanel(CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("ViewCourse", ViewCoursesJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnViewCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacklog;
    private javax.swing.JButton btnCourseReg;
    private javax.swing.JButton btnGraduate;
    private javax.swing.JButton btnRateProf;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JButton btnViewCourse;
    // End of variables declaration//GEN-END:variables
}
