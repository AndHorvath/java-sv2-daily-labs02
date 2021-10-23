package day04;

public class Car {

    // --- attributes ---------------------------------------------------------

    private int litresRefuelled;
    private int kilometresDriven;

    // --- getters and setters ------------------------------------------------

    public int getLitresRefuelled() { return this.litresRefuelled; }
    public void setLitresRefuelled(int litresRefuelled) { this.litresRefuelled = litresRefuelled; }

    public int getKilometresDriven() { return this.kilometresDriven; }
    public void setKilometresDriven(int kilometresDriven) { this.kilometresDriven = kilometresDriven; }

    // --- constructors -------------------------------------------------------

    public Car(int litresRefuelled, int kilometresDriven) {
        this.litresRefuelled = litresRefuelled;
        this.kilometresDriven = kilometresDriven;
    }

    // --- public methods -----------------------------------------------------

    public double calcAvgConsumption(int kilometersDriven) {
        double avgConsumption;

        avgConsumption = (double) this.litresRefuelled / (double) kilometersDriven * 100.0;
        return avgConsumption;
    }
}