/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.business;

import main.java.com.coursera.users.Faculty;
import java.util.ArrayList;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.Student;

/**
 *
 * @author sghar
 */
public class Course {

    private static int courseIdCounter = 0;
    private int courseId;
    private String courseName;
    private String courseStartDate;
    private String courseEndDate;
    private int assignedCredits;
    private int professorId;
    private int maxCapacity;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, String courseStartDate, String courseEndDate, int maxCapacity, int assignedCredits, int professorId, UserList userList) {
        this.courseId = ++courseIdCounter;
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.assignedCredits = assignedCredits;
        this.professorId = professorId;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(String courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public String getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(String courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    public void setAssignedCredits(int assignedCredits) {
        this.assignedCredits = assignedCredits;
    }

    public int getAssignedCredits() {
        return assignedCredits;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            return true; // Enrollment successful
        } else {
            return false; // Course is full, cannot enroll more students
        }
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public Faculty findProfessorById(int professorId, UserList userList) {
        // Look up the Faculty by their ID in the user list
        return userList.findFacultyById(professorId);
    }

}
