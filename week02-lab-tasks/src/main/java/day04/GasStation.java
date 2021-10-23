package day04;

public class GasStation {

    // --- attributes ---------------------------------------------------------

    private double priceLitre;

    // --- getters and setters ------------------------------------------------

    public double getPriceLitre() { return this.priceLitre; }
    public void setPriceLitre(double priceLitre) { this.priceLitre = priceLitre; }

    // --- constructors -------------------------------------------------------

    public GasStation(double priceLitre) { this.priceLitre = priceLitre; }

    // --- public methods -----------------------------------------------------

    public double refuel(Car car, int litresRefuelled) {
        double price;

        car.setLitresRefuelled(litresRefuelled);
        price = this.priceLitre * litresRefuelled;

        return price;
    }
}