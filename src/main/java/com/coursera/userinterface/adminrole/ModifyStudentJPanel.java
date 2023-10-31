/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.adminrole;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.Student;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class ModifyStudentJPanel extends javax.swing.JPanel {

    private DefaultTableModel studentTableModel;
    private javax.swing.JPanel CardSequencePanel;
    private UserList userList;
    private CourseList clist;

    /**
     * Creates new form ModifyStudentJPanel
     */
    public ModifyStudentJPanel(JPanel msjp, UserList ulist, CourseList clist) {
        this.CardSequencePanel = msjp;
        this.userList = ulist;
        this.clist = clist;
        initComponents();
        populateStudentTable(userList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeleteStudent = new javax.swing.JButton();
        btnBackModifyStudentDetails = new javax.swing.JButton();
        lblModifyStudentJPanel = new javax.swing.JLabel();
        btnUpdateStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteStudent.setBackground(new java.awt.Color(212, 31, 47));
        btnDeleteStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteStudent.setText("Delete");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        btnBackModifyStudentDetails.setBackground(new java.awt.Color(212, 31, 47));
        btnBackModifyStudentDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnBackModifyStudentDetails.setText("<< Back");
        btnBackModifyStudentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackModifyStudentDetailsActionPerformed(evt);
            }
        });

        lblModifyStudentJPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModifyStudentJPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModifyStudentJPanel.setText("Modify Student Details");

        btnUpdateStudent.setBackground(new java.awt.Color(212, 31, 47));
        btnUpdateStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStudent.setText("Update Details");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        StudentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Username", "Email", "Highest Education Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(StudentJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModifyStudentJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBackModifyStudentDetails)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblModifyStudentJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnBackModifyStudentDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateStudent)
                    .addComponent(btnDeleteStudent))
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        // TODO add your handling code here:
   int selectedRow = StudentJTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int userID = (int) StudentJTable.getValueAt(selectedRow, 0);
    User userToDelete = userList.getUserByID(userID);

    if (userToDelete != null && userToDelete instanceof Student) {
        int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirmDelete == JOptionPane.YES_OPTION) {
            if (userList.deleteUser(userID)) {
                populateStudentTable(userList); // Refresh the table after deletion
                JOptionPane.showMessageDialog(this, "Student deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete the student.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Student not found. Deletion failed.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnBackModifyStudentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackModifyStudentDetailsActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel adminWork = new AdminWorkAreaJPanel(CardSequencePanel, userList, clist);
        CardSequencePanel.add("AdminWorkJPanel", adminWork);

        // Show the FacultyJPanel
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "AdminWorkJPanel");
    }//GEN-LAST:event_btnBackModifyStudentDetailsActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        // TODO add your handling code here:
        int selectedRow = StudentJTable.getSelectedRow();

        if (selectedRow == -1) {
            // No row selected, display an error message
            JOptionPane.showMessageDialog(this, "Please select a student to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the student's user ID from the selected row
        int userID = (int) StudentJTable.getValueAt(selectedRow, 0);

        // Retrieve updated information from the selected row in the table
        String newFullname = (String) StudentJTable.getValueAt(selectedRow, 1);
        String newUsername = (String) StudentJTable.getValueAt(selectedRow, 2);
        String newEmail = (String) StudentJTable.getValueAt(selectedRow, 3);
        String newHighEduLevel = (String) StudentJTable.getValueAt(selectedRow, 4);

        // Attempt to update the student in UserList
        boolean updated = userList.updateStudent(userID, newUsername, newEmail, newFullname, newHighEduLevel);

        if (updated) {
            // Display a success message if the update is successful
            JOptionPane.showMessageDialog(this, "Student information updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Display an error message if the student is not found or the update fails
            JOptionPane.showMessageDialog(this, "Student not found or update failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentJTable;
    private javax.swing.JButton btnBackModifyStudentDetails;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblModifyStudentJPanel;
    // End of variables declaration//GEN-END:variables

    private void populateStudentTable(UserList userlist) {
        DefaultTableModel studentTableModel = (DefaultTableModel) StudentJTable.getModel();
        studentTableModel.setRowCount(0);

        for (User user : userlist.getAllUsers()) {
            if (user instanceof Student) {
                Student student = (Student) user;
                Object[] rowData = {
                    student.getUserID(),
                    student.getFullName(),
                    student.getUsername(),
                    student.getEmail(),
                    student.getHighEduLevel()
                };
                studentTableModel.addRow(rowData);
            }
        }
    }
}
