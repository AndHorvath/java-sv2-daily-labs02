package day05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RatingHandler ratingHandler = new RatingHandler();
        Viewer viewer = new Viewer();
        Movie movie;
        String title;
        int productionYear;
        int ratingNumber;

        System.out.println("Which movie would you like to rate?");
        title = scanner.nextLine();
        System.out.println("From which year?");
        productionYear = scanner.nextInt();
        System.out.println("How many viewers would like to rate the film?");
        ratingNumber = scanner.nextInt();

        movie = new Movie(title, productionYear);

        System.out.println(
            "The movie " + title + " from " + productionYear + " has not yet been rated.");
        System.out.println("Now, " + ratingNumber + " viewers can rate the film.");

        for (int i = 0; i < ratingNumber; i++) {
            ratingHandler.handleRating(scanner, viewer, movie, i + 1);
        }
    }
}