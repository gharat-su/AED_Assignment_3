/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.business;

import main.java.com.coursera.users.Faculty;
import main.java.com.coursera.users.Student;
import java.util.ArrayList;
/**
 *
 * @author sghar
 */
public class Business {
    
    private ArrayList<Course> courses; // Store a list of courses
    private ArrayList<Faculty> professors; // Store a list of professors
    private ArrayList<Student> students; // Store a list of students
    
    public Business() {
        courses = new ArrayList<>();
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }
    
       // Methods for core business operations
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addProfessor(Faculty professor) {
        professors.add(professor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Other methods for data retrieval and manipulation

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    public ArrayList<Faculty> getAllProfessors() {
        return professors;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
        
