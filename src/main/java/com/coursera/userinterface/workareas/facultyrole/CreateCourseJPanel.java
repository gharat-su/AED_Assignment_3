/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.facultyrole;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.java.com.coursera.business.Course;
import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class CreateCourseJPanel extends javax.swing.JPanel {

    private javax.swing.JPanel CardSequencePanel;
    private UserList ulist;
    private CourseList clist;
    private AuthManager authManager;

    /**
     * Creates new form CreateCourseJPanel
     *
     * @param ccjp
     */
    public CreateCourseJPanel(JPanel ccjp, CourseList courseList, UserList userList,  AuthManager authManager) {
        initComponents();
        this.CardSequencePanel = ccjp;
        this.clist = courseList;
        this.ulist = userList;
        this.authManager = authManager; // Initialize the AuthManager
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
        txtCreateCourseAssignedCredits = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitleCreateCourse = new javax.swing.JLabel();
        lblCreateCourseName = new javax.swing.JLabel();
        lblCreateCourseStartDate = new javax.swing.JLabel();
        lblCreateMaxNoOfStudents = new javax.swing.JLabel();
        txtCreateCourseName = new javax.swing.JTextField();
        lblCreateCourseAssignedCredits1 = new javax.swing.JLabel();
        lblCourseEndDate = new javax.swing.JLabel();
        txtCreateCourseSchedule1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCreateCourse.setBackground(new java.awt.Color(204, 0, 0));
        btnCreateCourse.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnCreateCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateCourse.setText("CREATE");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitleCreateCourse.setBackground(new java.awt.Color(0, 0, 0));
        lblTitleCreateCourse.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitleCreateCourse.setForeground(new java.awt.Color(255, 0, 0));
        lblTitleCreateCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleCreateCourse.setText("CREATE COURSE");
        lblTitleCreateCourse.setOpaque(true);

        lblCreateCourseName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseName.setText("Course Name:");

        lblCreateCourseStartDate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseStartDate.setText("Course Start Date:");

        lblCreateMaxNoOfStudents.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateMaxNoOfStudents.setText("Maximum No. of Students:");

        lblCreateCourseAssignedCredits1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCreateCourseAssignedCredits1.setText("Assigned Credits:");

        lblCourseEndDate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCourseEndDate.setText("Course End Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreateCourse)
                        .addGap(45, 45, 45)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCreateCourseName)
                            .addComponent(lblCreateCourseStartDate)
                            .addComponent(lblCreateMaxNoOfStudents)
                            .addComponent(lblCreateCourseAssignedCredits1)
                            .addComponent(lblCourseEndDate))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCreateCourseSchedule, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCreateCourseSchedule1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtCreateCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
            .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitleCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateCourseName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCreateCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateCourseStartDate)
                    .addComponent(txtCreateCourseSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseEndDate)
                    .addComponent(txtCreateCourseSchedule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateMaxNoOfStudents)
                    .addComponent(txtMaxNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreateCourseAssignedCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreateCourseAssignedCredits1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCourse)
                    .addComponent(btnBack))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this); // Remove the current panel
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel); // Show the previous panel
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
     // Get course details from input fields
    String courseName = txtCreateCourseName.getText();
    String courseStartDate = txtCreateCourseSchedule.getText(); // Renamed variable
    String courseEndDate = txtCreateCourseSchedule1.getText(); // New variable
    String maxStudentsText = txtMaxNoOfStudents.getText();
    String assignedCreditsText = txtCreateCourseAssignedCredits.getText();

    int maxCapacity;
    int assignedCredits;
    int professorId;

    // Validate and convert maxStudentsText to an integer
    try {
        maxCapacity = Integer.parseInt(maxStudentsText);
    } catch (NumberFormatException ex) {
        // Handle the error, show a user-friendly message
        JOptionPane.showMessageDialog(this, "Maximum Students must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }

    // Validate and convert assignedCreditsText to an integer
    try {
        assignedCredits = Integer.parseInt(assignedCreditsText);
    } catch (NumberFormatException ex) {
        // Handle the error, show a user-friendly message
        JOptionPane.showMessageDialog(this, "Assigned Credits must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }

    // Get the userID of the currently logged-in user
    User loggedInUser = authManager.getLoggedInUser();

    if (loggedInUser != null) {
        professorId = loggedInUser.getUserID();
    } else {
        // Handle the case when no user is logged in
        professorId = 0; // You can assign a default or error value here
    }

    // Validate input fields
    if (courseName.isEmpty() || courseStartDate.isEmpty() || courseEndDate.isEmpty()) {
        // Show a user-friendly message if any of the fields are empty
        JOptionPane.showMessageDialog(this, "Course Name, Course Start Date, and Course End Date are required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }

    // Assuming you have a reference to the business class (you should initialize it when creating the CreateCourseJPanel), create the course
    Course course = new Course(courseName, courseStartDate, courseEndDate, assignedCredits, professorId, maxCapacity, ulist); // Updated to include courseEndDate

    // Add the course to the CourseList (assuming you have access to the CourseList)
    clist.addCourse(course);

    // Show a confirmation message with course details
    String message = "Course created successfully:\n\n" +
            "Course Name: " + courseName + "\n" +
            "Course Start Date: " + courseStartDate + "\n" +
            "Course End Date: " + courseEndDate + "\n" + // Added Course End Date
            "Max Students: " + maxCapacity + "\n" +
            "Assigned Credits: " + assignedCredits;

    JOptionPane.showMessageDialog(this, message, "Course Created", JOptionPane.INFORMATION_MESSAGE);
    clearFormFields();
            CardSequencePanel.add("FacultyJPanel", new FacultyJPanel(CardSequencePanel, clist, ulist, authManager));
    }//GEN-LAST:event_btnCreateCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JLabel lblCourseEndDate;
    private javax.swing.JLabel lblCreateCourseAssignedCredits1;
    private javax.swing.JLabel lblCreateCourseName;
    private javax.swing.JLabel lblCreateCourseStartDate;
    private javax.swing.JLabel lblCreateMaxNoOfStudents;
    private javax.swing.JLabel lblTitleCreateCourse;
    private javax.swing.JTextField txtCreateCourseAssignedCredits;
    private javax.swing.JTextField txtCreateCourseName;
    private javax.swing.JTextField txtCreateCourseSchedule;
    private javax.swing.JTextField txtCreateCourseSchedule1;
    private javax.swing.JTextField txtMaxNoOfStudents;
    // End of variables declaration//GEN-END:variables

    private void clearFormFields() {
    txtCreateCourseName.setText(""); // Clear Course Name field
    txtCreateCourseSchedule.setText(""); // Clear Course Start Date field
    txtCreateCourseSchedule1.setText(""); // Clear Course End Date field
    txtMaxNoOfStudents.setText(""); // Clear Max Students field
    txtCreateCourseAssignedCredits.setText(""); // Clear Assigned Credits field
}
}
