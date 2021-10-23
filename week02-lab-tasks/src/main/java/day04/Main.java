package day04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car;
        GasStation gasStation;
        double priceLitre;
        double pricePaid;
        double avgConsumption;
        int litresRefuelled;
        int kilometresDriven;

        System.out.println("Enter the price of a litre of fuel in HUF!");
        priceLitre = scanner.nextDouble();

        System.out.println("Enter the amount of fuel purchased!");
        litresRefuelled = scanner.nextInt();

        System.out.println("Now, enter how many kilometres you have driven!");
        kilometresDriven = scanner.nextInt();

        car = new Car(0, kilometresDriven);
        gasStation = new GasStation(priceLitre);
        pricePaid = gasStation.refuel(car, litresRefuelled);
        avgConsumption = car.calcAvgConsumption(kilometresDriven);

        System.out.println("You have paid: " + pricePaid + " HUF");
        System.out.println("The average consumption of the car is: " + avgConsumption + " per 100 km");
    }
}
