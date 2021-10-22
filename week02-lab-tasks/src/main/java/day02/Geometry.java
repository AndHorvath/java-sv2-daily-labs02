package day02;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle;
        double edgeA;
        double edgeB;
        double area;

        System.out.println("Let R be a rectangle.");

        System.out.println("Please, set the length of edge A of R!");
        edgeA = scanner.nextDouble();

        System.out.println("Now, set the length of edge B!");
        edgeB = scanner.nextDouble();

        rectangle = new Rectangle(edgeA, edgeB);
        area = rectangle.calculateArea();

        System.out.println("The area of R is " + area);
    }
}
