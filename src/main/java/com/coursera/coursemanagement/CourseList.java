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
        if (counter == 0) {
            courses = new ArrayList<>();
	    nestedList = new ArrayList<>();
            counter++;
        }
    }
    public List<String> getList(String studentid, String courseid,String Status){
        List<String> innerList = new ArrayList<>();
        innerList.add(studentid);
        innerList.add(courseid);
        innerList.add(Status);
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

    public boolean updateCourseName(int courseId, String newCourseName) {
        Course course = getCourseById(courseId);
        if (course != null) {
            course.setCourseName(newCourseName);
            return true;
        }
        return false; // Course not found
    }

    public boolean updateAssignedCredits(int courseId, int newAssignedCredits) {
        Course course = getCourseById(courseId);
        if (course != null) {
            course.setAssignedCredits(newAssignedCredits);
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

    
    public int getProfessorIdForCourse(int courseId) {
        Course course = getCourseById(courseId);
        if (course != null) {
            return course.getProfessorId();
        }
        return -1; // Course not found
    }

    public Faculty getProfessorForCourse(int courseId, UserList userList) {
        int professorId = getProfessorIdForCourse(courseId); // Get the professor's ID for the course
        if (professorId != -1) {
            return userList.findFacultyById(professorId); // Look up the Faculty by their ID in the user list
        }
        return null; // Course not found or professor not found
    }
    
    public void printCourseList(CourseList courseList) {
    ArrayList<Course> courses = courseList.getAllCourses();
    
    System.out.println("Course List:");
    
    for (Course course : courses) {
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Assigned Professor ID: " + course.getProfessorId());
        System.out.println("Assigned Credits: " + course.getAssignedCredits());
        System.out.println("Max Capacity: " + course.getMaxCapacity());
        System.out.println("Start Date: " + course.getCourseStartDate());
        System.out.println("End Date: " + course.getCourseEndDate());
        System.out.println("----------------------------------------");
    }
}

}
