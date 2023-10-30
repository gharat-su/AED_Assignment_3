package main.java.com.coursera.business;

import java.util.ArrayList;

public class ProfessorRating {

    private static ProfessorRating instance;
    private ArrayList<Rating> ratings;

    private ProfessorRating() {
        ratings = new ArrayList<>();
    }

    public static ProfessorRating getInstance() {
        if (instance == null) {
            instance = new ProfessorRating();
        }
        return instance;
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }
    
        public double calculateAverageRating(int professorId) {
        int sum = 0;
        int count = 0;

        for (Rating rating : ratings) {
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