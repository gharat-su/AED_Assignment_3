/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.adminrole;

/**
 *
 * @author sanketkesarkar
 */
public class AdminCreateCourse extends javax.swing.JPanel {

    /**
     * Creates new form AdminCreateCourse
     */
    public AdminCreateCourse() {
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

        lblTitleCreateCourse = new javax.swing.JLabel();
        lblCreateCourseName = new javax.swing.JLabel();
        lblCreateCourseId = new javax.swing.JLabel();
        lblCreateProfessorName = new javax.swing.JLabel();
        lblCreateCourseStartDate = new javax.swing.JLabel();
        lblCreateMaxNoOfStudents = new javax.swing.JLabel();
        txtCreateCourseName = new javax.swing.JTextField();
        txtCreateCourseId = new javax.swing.JTextField();
        txtProfessorName = new javax.swing.JTextField();
        txtCreateCourseStartDate = new javax.swing.JTextField();
        txtMaxNoOfStudents = new javax.swing.JTextField();
        lblCreateCourseAssignedCredits = new javax.swing.JLabel();
        txtCreateCourseAssignedCredits = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblCreateCourseEndDate = new javax.swing.JLabel();
        txtCreateCourseEndDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitleCreateCourse.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitleCreateCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCreateCourse.setText("CREATE COURSE");

        lblCreateCourseName.setText("Course Name:");

        lblCreateCourseId.setText("Course ID:");

        lblCreateProfessorName.setText("Professor Name:");

        lblCreateCourseStartDate.setText("Course Start Date:");

        lblCreateMaxNoOfStudents.setText("Maximum No. of Students:");

        txtProfessorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorNameActionPerformed(evt);
            }
        });

        lblCreateCourseAssignedCredits.setText("Assigned Credits:");

        btnCreateCourse.setBackground(new java.awt.Color(212, 31, 47));
        btnCreateCourse.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnCreateCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateCourse.setText("CREATE");

        btnBack.setBackground(new java.awt.Color(212, 31, 47));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");

        lblCreateCourseEndDate.setText("CourseEnd Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreateCourseId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateCourseName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateProfessorName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateCourseStartDate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addComponent(txtCreateCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateCourseStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateCourseEndDate)
                            .addComponent(lblCreateCourseAssignedCredits)
                            .addComponent(lblCreateMaxNoOfStudents))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCreateCourseEndDate))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseName)
                    .addComponent(txtCreateCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseId)
                    .addComponent(txtCreateCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateProfessorName)
                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseStartDate)
                    .addComponent(txtCreateCourseStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseEndDate)
                    .addComponent(txtCreateCourseEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateMaxNoOfStudents)
                    .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateCourseAssignedCredits))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCourse)
                    .addComponent(btnBack))
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCreateCourseId, lblCreateCourseStartDate, lblCreateMaxNoOfStudents, lblCreateProfessorName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtProfessorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JLabel lblCreateCourseAssignedCredits;
    private javax.swing.JLabel lblCreateCourseEndDate;
    private javax.swing.JLabel lblCreateCourseId;
    private javax.swing.JLabel lblCreateCourseName;
    private javax.swing.JLabel lblCreateCourseStartDate;
    private javax.swing.JLabel lblCreateMaxNoOfStudents;
    private javax.swing.JLabel lblCreateProfessorName;
    private javax.swing.JLabel lblTitleCreateCourse;
    private javax.swing.JTextField txtCreateCourseAssignedCredits;
    private javax.swing.JTextField txtCreateCourseEndDate;
    private javax.swing.JTextField txtCreateCourseId;
    private javax.swing.JTextField txtCreateCourseName;
    private javax.swing.JTextField txtCreateCourseStartDate;
    private javax.swing.JTextField txtMaxNoOfStudents;
    private javax.swing.JTextField txtProfessorName;
    // End of variables declaration//GEN-END:variables
}
