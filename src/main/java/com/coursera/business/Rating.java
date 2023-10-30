/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.business;

/**
 *
 * @author sghar
 */
public class Rating {

    private int studentId;
    private int professorId;
    private int rating;
    private String comments;

    public Rating(int studentId, int professorId, int rating, String comments) {
        this.studentId = studentId;
        this.professorId = professorId;
        this.rating = rating;
        this.comments = comments;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }
}
