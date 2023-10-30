package main.java.com.coursera.business;

import java.util.ArrayList;

public class ProfessorRating {

    private static ProfessorRating instance;
    private ArrayList<Rating> studentratings;
    private ArrayList<Rating> employerRatings;

    private ProfessorRating() {
        studentratings = new ArrayList<>();
        employerRatings = new ArrayList<>();
    }

    public static ProfessorRating getInstance() {
        if (instance == null) {
            instance = new ProfessorRating();
        }
        return instance;
    }

    public void addRating(Rating rating) {
        studentratings.add(rating);
    }

    public ArrayList<Rating> getRatings() {
        return studentratings;
    }

    public void addEmployerRating(Rating rating) {
        employerRatings.add(rating);
    }

    public ArrayList<Rating> getStudentRatings() {
        return studentratings;
    }

    public ArrayList<Rating> getEmployerRatings() {
        return employerRatings;
    }

    public double calculateAverageRating(int professorId) {
        int sum = 0;
        int count = 0;

        for (Rating rating : studentratings) {
            if (rating.getProfessorId() == professorId) {
                sum += rating.getRating();
                count++;
            }
        }

        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0.0; // Return 0 if there are no ratings for the professor.
        }
    }
}
