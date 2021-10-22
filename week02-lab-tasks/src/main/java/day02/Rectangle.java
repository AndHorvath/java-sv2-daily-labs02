package day02;

public class Rectangle {

    // --- attributes ---------------------------------------------------------

    private double edgeA;
    private double edgeB;

    // --- getters and setters ------------------------------------------------

    public double getEdgeA() { return this.edgeA; }
    public void setEdgeA(double edgeA) { this.edgeA = edgeA; }

    public double getEdgeB() { return this.edgeB; }
    public void setEdgeB(double edgeB) { this.edgeB = edgeB; }

    // --- constructors -------------------------------------------------------

    public Rectangle(double edgeA, double edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    // --- public methods -----------------------------------------------------

    public double calculateArea() {
        return edgeA * edgeB;
    }
}
