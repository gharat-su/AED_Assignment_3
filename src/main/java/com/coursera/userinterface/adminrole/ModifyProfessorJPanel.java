/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.adminrole;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.userinterface.workareas.facultyrole.ModifyCourseJPanel;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.Faculty;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class ModifyProfessorJPanel extends javax.swing.JPanel {

    private DefaultTableModel professorTableModel;
    private javax.swing.JPanel CardSequencePanel;
    private UserList ulist;
    private CourseList clist;
    private AuthManager authManager;
    private int professorId; // Add professorId variable

    /**
     * Creates new form ModifyProfessorJPanel
     */
    public ModifyProfessorJPanel(JPanel prjp, UserList ulist, CourseList clist) {
        this.CardSequencePanel = prjp;
        this.ulist = ulist;
        this.clist = clist;
        initComponents();
        clist.printCourseList(clist);
        populateProfessorTable(ulist);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModifyProfessorJPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfessorJTable = new javax.swing.JTable();
        btnBackModifyProfessorDetails = new javax.swing.JButton();
        btnUpdateProfessor = new javax.swing.JButton();
        btnDeleteProfessor = new javax.swing.JButton();
        btnCourses = new javax.swing.JButton();

        lblModifyProfessorJPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModifyProfessorJPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModifyProfessorJPanel.setText("Modify Professor Details");

        ProfessorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "userID", "Professor Name", "Email", "Specialization", "Years Of Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(ProfessorJTable);

        btnBackModifyProfessorDetails.setText("<< Back");
        btnBackModifyProfessorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackModifyProfessorDetailsActionPerformed(evt);
            }
        });

        btnUpdateProfessor.setText("Update Details");
        btnUpdateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfessorActionPerformed(evt);
            }
        });

        btnDeleteProfessor.setText("Delete");
        btnDeleteProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProfessorActionPerformed(evt);
            }
        });

        btnCourses.setText("Courses");
        btnCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModifyProfessorJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBackModifyProfessorDetails)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblModifyProfessorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnBackModifyProfessorDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateProfessor)
                    .addComponent(btnDeleteProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCourses)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackModifyProfessorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackModifyProfessorDetailsActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel adminWork = new AdminWorkAreaJPanel(CardSequencePanel, ulist, clist);
        CardSequencePanel.add("AdminWorkJPanel", adminWork);

        // Show the FacultyJPanel
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).show(CardSequencePanel, "AdminWorkJPanel");
    }//GEN-LAST:event_btnBackModifyProfessorDetailsActionPerformed

    private void btnUpdateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfessorActionPerformed
        // TODO add your handling code here:
        // Get the selected row from the table
        int selectedRow = ProfessorJTable.getSelectedRow();

        if (selectedRow == -1) {
            // No row selected, display an error message
            JOptionPane.showMessageDialog(this, "Please select a professor to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the professor's user ID from the selected row
        int userID = (int) ProfessorJTable.getValueAt(selectedRow, 0);
        professorId = userID;
        // Retrieve the faculty from the UserList using the user ID
        Faculty facultyToUpdate = ulist.findFacultyById(userID);

        if (facultyToUpdate != null) {
            // Update faculty details
            String updatedName = (String) ProfessorJTable.getValueAt(selectedRow, 1);
            String updatedEmail = (String) ProfessorJTable.getValueAt(selectedRow, 2);
            String updatedSpecialization = (String) ProfessorJTable.getValueAt(selectedRow, 3);
            String updatedExperience = (String) ProfessorJTable.getValueAt(selectedRow, 4);

            // Update faculty properties
            facultyToUpdate.setFullName(updatedName);
            facultyToUpdate.setEmail(updatedEmail);
            facultyToUpdate.setSpecialization(updatedSpecialization);
            facultyToUpdate.setExperience(updatedExperience);

            // Display a success message
            JOptionPane.showMessageDialog(this, "Professor details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Faculty not found, display an error message
            JOptionPane.showMessageDialog(this, "Professor not found. Update failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateProfessorActionPerformed

    private void btnDeleteProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProfessorActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProfessorJTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a professor to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userID = (int) ProfessorJTable.getValueAt(selectedRow, 0);
        Faculty facultyToDelete = ulist.findFacultyById(userID);

        if (facultyToDelete != null) {
            int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this professor?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmDelete == JOptionPane.YES_OPTION) {
                if (ulist.deleteUser(userID)) {
                    //professorTableModel.removeRow(selectedRow);
                    populateProfessorTable(ulist); // Refresh the table after deletion
                    JOptionPane.showMessageDialog(this, "Professor deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete the professor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Professor not found. Deletion failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteProfessorActionPerformed

    private void btnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursesActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProfessorJTable.getSelectedRow();

        if (selectedRow == -1) {
            // No row selected, display an error message
            JOptionPane.showMessageDialog(this, "Please select a professor to get Courses.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ModifyCourseJPanel modifycourseJPanel;
        modifycourseJPanel = new ModifyCourseJPanel(CardSequencePanel, clist, ulist, authManager, professorId);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("ModifyCourse", modifycourseJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnCoursesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProfessorJTable;
    private javax.swing.JButton btnBackModifyProfessorDetails;
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnDeleteProfessor;
    private javax.swing.JButton btnUpdateProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModifyProfessorJPanel;
    // End of variables declaration//GEN-END:variables

    private void populateProfessorTable(UserList ulist) {
        DefaultTableModel professorTableModel = (DefaultTableModel) ProfessorJTable.getModel();
        professorTableModel.setRowCount(0);

        for (User user : ulist.getAllUsers()) {
            if (user instanceof Faculty) {
                Faculty faculty = (Faculty) user;
                Object[] rowData = {
                    faculty.getUserID(),
                    faculty.getFullName(),
                    faculty.getEmail(),
                    faculty.getSpecialization(),
                    faculty.getExperience()
                };
                professorTableModel.addRow(rowData);
            }
        }
    }
}
