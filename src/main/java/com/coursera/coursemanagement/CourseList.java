/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.coursemanagement;

import java.util.ArrayList;
import java.util.List;
import main.java.com.coursera.business.Course;
import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.Faculty;
import main.java.com.coursera.users.Student;

/**
 *
 * @author sghar 
 */
public class CourseList {
     private static ArrayList<Course> courses;
     public static List<List<String>> nestedList;//Pradnya
     static int counter;

    public CourseList() {
        if(counter==0){
        courses = new ArrayList<>();
        nestedList = new ArrayList<>();
        counter++;
       
        }
         //System.out.println("main"+courses.size());
    }
//  public void CourseListNew() {
//      courses=new ArrayList<>();
//      
//  }
    public List<String> getList(String studentid, String courseid){
        List<String> innerList = new ArrayList<>();
        innerList.add(studentid);
        innerList.add(courseid);
        return innerList;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("add"+courses.size());
    }

    public Course getCourseById(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null; // Course not found
    }

    public ArrayList<Course> getAllCourses() {
        System.out.println("get"+courses.size());
        return courses;
    }

    public boolean updateCourseDates(int courseId, String newStartDate, String newEndDate) {
        Course course = getCourseById(courseId);
        if (course != null) {
            course.setCourseStartDate(newStartDate);
            course.setCourseEndDate(newEndDate);
            return true;
        }
        return false; // Course not found
    }

    public boolean updateCourseCapacity(int courseId, int newCapacity) {
        Course course = getCourseById(courseId);
        if (course != null) {
            course.setMaxCapacity(newCapacity);
            return true;
        }
        return false; // Course not found
    }
    
    public boolean enrollStudentInCourse(int courseId, Student student) {
        Course course = getCourseById(courseId);
        if (course != null) {
            return course.enrollStudent(student);
        }
        return false; // Course not found
    }

    public boolean removeStudentFromCourse(int courseId, Student student) {
        Course course = getCourseById(courseId);
        if (course != null) {
            course.removeStudent(student);
            return true;
        }
        return false; // Course not found
    }

    public ArrayList<Student> getEnrolledStudents(int courseId) {
        Course course = getCourseById(courseId);
        if (course != null) {
            return course.getEnrolledStudents();
        }
        return new ArrayList<>(); // Course not found or no enrolled students
    }

    public Faculty getProfessorForCourse(int courseId, UserList userList) {
        Course course = getCourseById(courseId);
        if (course != null) {
            return course.getProfessor();
        }
        return null; // Course not found
    }
    
}
