/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.adminrole;

/**
 *
 * @author sanketkesarkar
 */
public class AdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkArea
     */
    public AdminWorkArea() {
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

        btnAdminCreateCourse = new javax.swing.JButton();
        btnAdminCreateEmployee = new javax.swing.JButton();
        btnAdminCreateProfessor = new javax.swing.JButton();
        lblAdminWorkAreaTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnAdminCreateCourse.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnAdminCreateCourse.setText("Create Course");
        btnAdminCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCreateCourseActionPerformed(evt);
            }
        });

        btnAdminCreateEmployee.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnAdminCreateEmployee.setText("Create Employee");
        btnAdminCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminCreateEmployeeActionPerformed(evt);
            }
        });

        btnAdminCreateProfessor.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnAdminCreateProfessor.setText("Create Professor");

        lblAdminWorkAreaTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblAdminWorkAreaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminWorkAreaTitle.setText("ADMIN WORKAREA");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdminWorkAreaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdminCreateProfessor)
                    .addComponent(btnAdminCreateEmployee)
                    .addComponent(btnAdminCreateCourse))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(0, 467, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdminCreateCourse, btnAdminCreateEmployee, btnAdminCreateProfessor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblAdminWorkAreaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminCreateCourse)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(btnAdminCreateEmployee)
                .addGap(37, 37, 37)
                .addComponent(btnAdminCreateProfessor)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCreateCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminCreateCourseActionPerformed

    private void btnAdminCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminCreateEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminCreateEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminCreateCourse;
    private javax.swing.JButton btnAdminCreateEmployee;
    private javax.swing.JButton btnAdminCreateProfessor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdminWorkAreaTitle;
    // End of variables declaration//GEN-END:variables
}
