/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.facultyrole;

import javax.swing.JPanel;

/**
 *
 * @author sghar
 */
public class GradeStudentsJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    
    /**
     * Creates new form GradeStudentsJPanel
     * @param gsjp
     */
    
    public GradeStudentsJPanel(JPanel gsjp) {
        initComponents();
        this.CardSequencePanel = gsjp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBacklog = new javax.swing.JButton();
        cbSelectCourse = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCourseSelect = new javax.swing.JLabel();
        btnSaveChanges = new javax.swing.JButton();

        btnBacklog.setText("<<Back");
        btnBacklog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacklogActionPerformed(evt);
            }
        });

        cbSelectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course1", "Course2", "Course3" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "StudentID", "Name", "Course", "Term", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblCourseSelect.setText("Filter by :");

        btnSaveChanges.setText("Save Changes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBacklog)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourseSelect)
                                .addGap(18, 18, 18)
                                .addComponent(cbSelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSaveChanges))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBacklog)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseSelect))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChanges)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacklogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacklogActionPerformed
        // TODO add your handling code here:
        FacultyJPanel facultyJPanel;
        facultyJPanel = new FacultyJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Back", facultyJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBacklogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacklog;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JComboBox<String> cbSelectCourse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCourseSelect;
    // End of variables declaration//GEN-END:variables
}
