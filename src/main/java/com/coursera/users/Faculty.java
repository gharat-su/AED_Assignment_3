/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.users;
/**
 *
 * @author sghar
 */
public class Faculty extends User {
    private String specialization;
    private String experience;

    public Faculty(String username, String password, String email, String fullName, UserType userType, String specialization, String experience) {
        super(username, password, email, fullName, userType);
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
}
