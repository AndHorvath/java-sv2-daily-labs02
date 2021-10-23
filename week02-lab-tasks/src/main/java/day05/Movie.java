package day05;

public class Movie {

    // --- attributes ---------------------------------------------------------

    private String title;
    private int productionYear;
    private int numberOfRatings;
    private int ratingsSum;
    private double avgRating;

    // --- getters and setters ------------------------------------------------

    public String getTitle() {
        return title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public int getRatingsSum() {
        return ratingsSum;
    }

    // --- constructors -------------------------------------------------------

    public Movie(String title, int productionYear) {
        this.title = title;
        this.productionYear = productionYear;
        this.numberOfRatings = 0;
        this.ratingsSum = 0;
    }

    // --- public methods -----------------------------------------------------

    double getAvgRating(int ratingValue) {
        this.ratingsSum += ratingValue;
        this.numberOfRatings += 1;
        this.avgRating = (double)this.ratingsSum / (double)this.numberOfRatings;

        return this.avgRating;
    }
}
