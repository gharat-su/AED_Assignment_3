/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.business;

import main.java.com.coursera.users.Faculty;
import java.util.ArrayList;

/**
 *
 * @author sghar
 */
public class Course {
    private String courseName;
    private Faculty professor;
    private String courseSchedule;
    private int maxStudents;
    private int assignedCredits;


    public Course(String courseName, Faculty professor, String courseSchedule, int maxStudents, int assignedCredits, ArrayList<String> tags) {
        this.courseName = courseName;
        this.professor = professor;
        this.courseSchedule = courseSchedule;
        this.maxStudents = maxStudents;
        this.assignedCredits = assignedCredits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Faculty getProfessor() {
        return professor;
    }

    public void setProfessor(Faculty professor) {
        this.professor = professor;
    }

    public String getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(String courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getAssignedCredits() {
        return assignedCredits;
    }

    public void setAssignedCredits(int assignedCredits) {
        this.assignedCredits = assignedCredits;
    }

}
