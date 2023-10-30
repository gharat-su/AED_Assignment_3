/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.employerrole;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.java.com.coursera.business.Course;
import main.java.com.coursera.business.ProfessorRating;
import main.java.com.coursera.business.Rating;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.Faculty;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class EmployerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployerJPanel
     */
    private UserList ulist;  // Reference to your UserList
    private CourseList clist;
    private javax.swing.JPanel CardSequencePanel;
    private int employerId;

    public EmployerJPanel(JPanel ejp, UserList userList, CourseList courseList, int employerId) {

        initComponents();
        this.CardSequencePanel = ejp;
        this.ulist = userList;
        this.clist = courseList;
        this.employerId = employerId;
        populateProfessorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProfessorDataJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaComments = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxRating = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        ProfessorDataJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Professor Id", "Professor Name", "Student Rating", "Number of Courses", "Enrolled Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProfessorDataJTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rating");

        lblComments.setText("Comments :");

        textAreaComments.setColumns(20);
        textAreaComments.setRows(5);
        jScrollPane2.setViewportView(textAreaComments);

        jLabel5.setText("Would you recommend this professor to other students? :");

        jComboBoxRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("(On a scale of 1 to 5 : 1 is minimum and 5 is maximum)");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lblComments))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jComboBoxRating, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRating, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComments)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    int selectedRow = ProfessorDataJTable.getSelectedRow();
    int selectedRating = Integer.parseInt(jComboBoxRating.getSelectedItem().toString());
    String comments = textAreaComments.getText();

    // You may want to add more error checking and validation here
    // Find the selected professor's ID from the table
    int selectedProfessorId = -1;
    if (selectedRow >= 0) {
        selectedProfessorId = (int) ProfessorDataJTable.getValueAt(selectedRow, 0); // Assuming the professor ID is in the first column (column 0)
    }

    // Update the professor's employer rating in the data model
    if (selectedProfessorId != -1) {  // Ensure a professor is selected
        ProfessorRating professorRating = ProfessorRating.getInstance();
        Rating employerRating = new Rating(employerId, selectedProfessorId, selectedRating, comments);
        professorRating.addEmployerRating(employerRating);

        // Optionally, update the displayed table to reflect the updated rating
        DefaultTableModel professorTableModel = (DefaultTableModel) ProfessorDataJTable.getModel();
        for (int i = 0; i < professorTableModel.getRowCount(); i++) {
            int professorId = (int) professorTableModel.getValueAt(i, 0);
            if (professorId == selectedProfessorId) {
                // Update the rating and comments in the table
                professorTableModel.setValueAt(selectedRating, i, 2); // Assuming the rating column is in the third position (column 2)
                professorTableModel.fireTableDataChanged();
                break;  // Exit the loop since the professor is found
            }
        }
    }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProfessorDataJTable;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> jComboBoxRating;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JTextArea textAreaComments;
    // End of variables declaration//GEN-END:variables

    private void populateProfessorTable() {
        DefaultTableModel professorTableModel = (DefaultTableModel) ProfessorDataJTable.getModel();
        professorTableModel.setRowCount(0);

        for (User user : ulist.getAllUsers()) {
            if (user instanceof Faculty) {
                Faculty faculty = (Faculty) user;
                int professorId = faculty.getUserID();

                double averageRating = ProfessorRating.getInstance().calculateAverageRating(professorId);
                int numberOfCourses = getNumberOfCoursesForProfessor(professorId);
                int enrolledStudents = getEnrolledStudentsForProfessorCourses(professorId);

                Object[] rowData = {
                    faculty.getUserID(),
                    faculty.getFullName(),
                    averageRating,
                    numberOfCourses,
                    enrolledStudents
                };
                professorTableModel.addRow(rowData);
            }
        }
    }

    private int getNumberOfCoursesForProfessor(int professorId) {
        return clist.getNumberOfCoursesForProfessor(professorId);
    }

    private int getEnrolledStudentsForProfessorCourses(int professorId) {
        return clist.getEnrolledStudentsForProfessorCourses(professorId);
    }
}
