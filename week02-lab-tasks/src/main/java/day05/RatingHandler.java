package day05;

import java.util.Scanner;

public class RatingHandler {

    public void handleRating(Scanner scanner, Viewer viewer, Movie movie, int ratingNumber ) {
        int ratingValue;
        double avgRating;

        System.out.println("Enter the " + ratingNumber + "." + " rating!");
        ratingValue = scanner.nextInt();
        avgRating = viewer.watchMovie(movie, ratingValue);
        System.out.println("Now, the average rating is: " + avgRating);
    }
}
