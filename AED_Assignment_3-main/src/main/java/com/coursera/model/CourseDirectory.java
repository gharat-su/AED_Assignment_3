/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.model;

import java.util.ArrayList;

/**
 *
 * @author pradnyashinde
 */
public class CourseDirectory {
    
    private ArrayList<Course>courseList;

    public CourseDirectory() {
        
        this.courseList=new ArrayList<Course>();
        
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    
      public Course addCourse(){
        Course course=new Course();
        courseList.add(course);
        return course;
        
    }
    
    public void deleteCourse(Course course){
        courseList.remove(course);
        
    }
    
    public Course searchCourse(String courseName){
        for(Course course: courseList)
        {
            if(course.getCourseName().equals(courseName)){
                return course;
            }
            
        }
        return null;
    }
    
}
