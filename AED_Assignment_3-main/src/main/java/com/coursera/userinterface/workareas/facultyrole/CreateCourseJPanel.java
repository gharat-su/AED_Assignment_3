/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.facultyrole;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.java.com.coursera.userinterface.authentication.LoginJPanel;

/**
 *
 * @author sghar
 */
public class CreateCourseJPanel extends javax.swing.JPanel {

     javax.swing.JPanel CardSequencePanel;
    /**
     * Creates new form CreateCourseJPanel
     * @param ccjp
     * @param courseDirectory
     */
    public CreateCourseJPanel(JPanel ccjp) {
        initComponents();
        this.CardSequencePanel =ccjp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCreateCourseSchedule = new javax.swing.JTextField();
        txtMaxNoOfStudents = new javax.swing.JTextField();
        lbltags = new javax.swing.JLabel();
        txtCreateCourseAssignedCredits = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitleCreateCourse = new javax.swing.JLabel();
        lblCreateCourseName = new javax.swing.JLabel();
        lblCreateProfessorName = new javax.swing.JLabel();
        lblCreateCourseSchedule = new javax.swing.JLabel();
        lblCreateMaxNoOfStudents = new javax.swing.JLabel();
        txtCreateCourseName = new javax.swing.JTextField();
        txtProfessorName = new javax.swing.JTextField();
        lblCreateCourseAssignedCredits1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        lbltags.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbltags.setText("tags:");

        btnCreateCourse.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnCreateCourse.setText("CREATE");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitleCreateCourse.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitleCreateCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCreateCourse.setText("CREATE COURSE");

        lblCreateCourseName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseName.setText("Course Name:");

        lblCreateProfessorName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateProfessorName.setText("Professor Name:");

        lblCreateCourseSchedule.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseSchedule.setText("Term:");

        lblCreateMaxNoOfStudents.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateMaxNoOfStudents.setText("Course Id:");

        txtProfessorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorNameActionPerformed(evt);
            }
        });

        lblCreateCourseAssignedCredits1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseAssignedCredits1.setText("Assigned Credits:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(lblCreateCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)
                                .addComponent(txtCreateCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbltags)
                                            .addComponent(lblCreateProfessorName)
                                            .addComponent(lblCreateCourseSchedule)
                                            .addComponent(lblCreateMaxNoOfStudents)
                                            .addComponent(lblCreateCourseAssignedCredits1))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCreateCourseSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(txtProfessorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(287, 287, 287)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btnCreateCourse)
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseName)
                    .addComponent(txtCreateCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateProfessorName)
                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseSchedule)
                    .addComponent(txtCreateCourseSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateMaxNoOfStudents)
                    .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateCourseAssignedCredits1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltags)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateCourse)
                            .addComponent(btnBack))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProfessorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       /* FacultyJPanel facultyJPanel;
        facultyJPanel = new FacultyJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Back", facultyJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);*/
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        //CourseDirectory cd = new CourseDirectory();
        String courseName=txtCreateCourseName.getText();
        String term=txtCreateCourseSchedule.getText();
        String courseId=txtMaxNoOfStudents.getText();
        
        
    
        
        
        JOptionPane.showMessageDialog(null,"Course Successfully Created");
        
        LoginJPanel loginJPanel;
        loginJPanel = new LoginJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Back", loginJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
    }//GEN-LAST:event_btnCreateCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateCourseAssignedCredits1;
    private javax.swing.JLabel lblCreateCourseName;
    private javax.swing.JLabel lblCreateCourseSchedule;
    private javax.swing.JLabel lblCreateMaxNoOfStudents;
    private javax.swing.JLabel lblCreateProfessorName;
    private javax.swing.JLabel lblTitleCreateCourse;
    private javax.swing.JLabel lbltags;
    private javax.swing.JTextField txtCreateCourseAssignedCredits;
    private javax.swing.JTextField txtCreateCourseName;
    private javax.swing.JTextField txtCreateCourseSchedule;
    private javax.swing.JTextField txtMaxNoOfStudents;
    private javax.swing.JTextField txtProfessorName;
    // End of variables declaration//GEN-END:variables
}