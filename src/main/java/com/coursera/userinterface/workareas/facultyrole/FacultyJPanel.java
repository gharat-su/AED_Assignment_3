/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.facultyrole;

import javax.swing.JPanel;
import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class FacultyJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    private UserList ulist;
    private CourseList clist;
    private AuthManager authManager;
    private User loggedInUser;
    /**
     * Creates new form FacultyWorkAreaJPanel
     *
     * @param fjp
     */
    public FacultyJPanel(JPanel fjp, CourseList courseList, UserList userList, AuthManager authManager) {
        initComponents();
        this.CardSequencePanel = fjp;
        this.clist = courseList;
        this.ulist = userList;
        this.authManager = authManager;
        
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

        btnCreateCourse = new javax.swing.JButton();
        btnModifyCourse = new javax.swing.JButton();
        btnScheduleCourse = new javax.swing.JButton();
        btnBacklog = new javax.swing.JButton();
        btnGradeStudents = new javax.swing.JButton();

        btnCreateCourse.setText("Create Course");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnModifyCourse.setText("Modify Course");
        btnModifyCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCourseActionPerformed(evt);
            }
        });

        btnScheduleCourse.setText("Schedule Course");
        btnScheduleCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleCourseActionPerformed(evt);
            }
        });

        btnBacklog.setText("<<Back");
        btnBacklog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacklogActionPerformed(evt);
            }
        });

        btnGradeStudents.setText("Grade Students");
        btnGradeStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBacklog)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGradeStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifyCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnScheduleCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBacklog)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModifyCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnScheduleCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnGradeStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        CreateCourseJPanel createcourseJPanel;
        createcourseJPanel = new CreateCourseJPanel(CardSequencePanel, clist, ulist, authManager);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CreateCourse", createcourseJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnCreateCourseActionPerformed

    private void btnModifyCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCourseActionPerformed
        // TODO add your handling code here:
        ModifyCourseJPanel modifycourseJPanel;
        modifycourseJPanel = new ModifyCourseJPanel(CardSequencePanel, clist, ulist, loggedInUser);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ModifyCourse", modifycourseJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnModifyCourseActionPerformed

    private void btnScheduleCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleCourseActionPerformed
        // TODO add your handling code here:
        ScheduleCourseJPanel schedulecourseJPanel;
        schedulecourseJPanel = new ScheduleCourseJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ScheduleCourse", schedulecourseJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnScheduleCourseActionPerformed

    private void btnBacklogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacklogActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this); // Remove the current panel
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel); // Show the previous panel
    }//GEN-LAST:event_btnBacklogActionPerformed

    private void btnGradeStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeStudentsActionPerformed
        // TODO add your handling code here:
        GradeStudentsJPanel gradestudentsJPanel;
        gradestudentsJPanel = new GradeStudentsJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("GradeStudents", gradestudentsJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnGradeStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacklog;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JButton btnGradeStudents;
    private javax.swing.JButton btnModifyCourse;
    private javax.swing.JButton btnScheduleCourse;
    // End of variables declaration//GEN-END:variables
}
