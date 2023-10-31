/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.coursera.userinterface.workareas.StudentRole;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.java.com.coursera.auth.AuthManager;
import main.java.com.coursera.business.Course;
import main.java.com.coursera.coursemanagement.CourseList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.User;

/**
 *
 * @author pradnyashinde
 */
public class ViewCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCoursesJPanel
     */
    javax.swing.JPanel CardSequencePanel;
    private CourseList courseList;
    private int studentId;
     private UserList ulist;
     private User loggedInUser;
    private AuthManager authManager;
    public ViewCoursesJPanel(JPanel csp,User student,UserList userList, AuthManager authManager) {
        this.CardSequencePanel =csp;
        initComponents();
        this.courseList=new CourseList();
        this.ulist = userList;
        this.authManager = authManager;
        this.studentId = student.getUserID();
        this.loggedInUser = authManager.getLoggedInUser();
        txtStuId.setText(String.valueOf(studentId));
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCourseId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnBackCourse = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListCourses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtStuId = new javax.swing.JTextField();
        btnGraduate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Course Id");

        lblStatus.setText("Status");

        btnBackCourse.setBackground(new java.awt.Color(212, 31, 47));
        btnBackCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnBackCourse.setText("<<Back");
        btnBackCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCourseActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(212, 31, 47));
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Mark As Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        tblListCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Course Name", "Professor", "Professor Rating", "Course Start Date", "Course End Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListCoursesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListCourses);

        jLabel2.setText("Student Id:");

        btnGraduate.setBackground(new java.awt.Color(212, 31, 47));
        btnGraduate.setForeground(new java.awt.Color(255, 255, 255));
        btnGraduate.setText("Graduate?");
        btnGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtStuId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBackCourse)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(101, 101, 101)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(txtCourseId)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBackCourse)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCourseActionPerformed
        // TODO add your handling code here:
                StudentJPanel panel=new StudentJPanel(CardSequencePanel, courseList, ulist, authManager);
                CardSequencePanel.add("StudentJPanel",panel);
                CardLayout layout=(CardLayout) CardSequencePanel.getLayout();
                layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnBackCourseActionPerformed

    private void tblListCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListCoursesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblListCourses.getModel();
        int index=tblListCourses.getSelectedRow();
        //txtStuId.setText(model.getValueAt(index,0).toString());
        txtCourseId.setText(model.getValueAt(index,1).toString());
        txtStatus.setText(model.getValueAt(index,7).toString());
    }//GEN-LAST:event_tblListCoursesMouseClicked

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        String StudId = txtStuId.getText();
        String CourseId = txtCourseId.getText();
        //String ProfId = txtProfId.getText();
        String status = "Completed";//Pradnya ---update previous status
        //courseList.nestedList.add(courseList.getList(StudId, CourseId,status));//Pradnya
        for(List<String> clist:courseList.nestedList){
            if(clist.get(0).equals(StudId) && clist.get(1).equals(CourseId)){

                System.out.println("entered");
                clist.set(2,"Completed");
                System.out.println(courseList.nestedList);
                  //temp.add(clist.get(2));
                  //System.out.println(courseList.nestedList);
                
            }
        }
        populateTable();
       
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnGraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduateActionPerformed
        // TODO add your handling code here:
        //Pradnya- If 2 courses completed else error
        int counter = 0;
        String stdId = Integer.toString(studentId);
        for(List<String> clist:courseList.nestedList){
            if(clist.get(0).equals(stdId)){
                if(clist.get(2).equals("Completed")){
                    counter++;
                }
                //temp.add(clist.get(2));
                //System.out.println(courseList.nestedList);
            }
        }
        if (counter>=2){
            GraduatedJPanel GraduatedJPanel;
            GraduatedJPanel = new GraduatedJPanel(CardSequencePanel,loggedInUser,ulist,authManager,courseList);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Transcript", GraduatedJPanel);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        }
        else{
            JOptionPane.showMessageDialog(null,"You have not completed all the required courses");
            System.out.println("you are failed");
        }

    }//GEN-LAST:event_btnGraduateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCourse;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnGraduate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblListCourses;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStuId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        String status = "";//
        DefaultTableModel dtm=(DefaultTableModel) tblListCourses.getModel();
        dtm.setRowCount(0);
        String student=String.valueOf(studentId);
        List<String> temp = new ArrayList<>();
        for(List<String> clist:courseList.nestedList){
            if(clist.get(0).equals(student)){
                temp.add(clist.get(1));
                  //temp.add(clist.get(2));
                  System.out.println(courseList.nestedList);
            }
        }
        for(Course c:courseList.getAllCourses()){
            
        
            for(String tmp: temp){
                
                if(Integer.toString(c.getCourseId()).equals(tmp))
                    
                
        
        {
            Object[] row=new Object[10];
            row[0]=studentId;
            row[1] = c.getCourseId();
            row[2]=c.getCourseName();
            row[3]=courseList.getProfessorIdForCourse(c.getCourseId());
            row[4]="5";
            row[5]=c.getCourseStartDate();
            row[6]=c.getCourseEndDate();
            for(List<String> clist:courseList.nestedList){
            if(clist.get(0).equals(Integer.toString(studentId)) && clist.get(1).equals(Integer.toString(c.getCourseId()))){
                System.out.println("entered");
                row[7]=clist.get(2);
                System.out.println(clist.get(2));
                  //temp.add(clist.get(2));
                  //System.out.println(courseList.nestedList);
            }
        }
            //row[7]=status;
            
            dtm.addRow(row);
        }
                }
            }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
