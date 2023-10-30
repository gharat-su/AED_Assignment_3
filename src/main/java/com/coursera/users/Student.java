/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.users;

/**
 *
 * @author sghar
 */
public class Student  extends User {
    private String high_edu_level;
    
    public Student(String username, String password, String email, String fullName, UserType userType, String high_edu_level) {
        super(username,password, email, fullName, userType);
        this.high_edu_level = high_edu_level;
    }

    public String getHighEduLevel() {
        return high_edu_level;
    }

    public void setHighEduLevel(String high_edu_level) {
        this.high_edu_level = high_edu_level;
    }

}
