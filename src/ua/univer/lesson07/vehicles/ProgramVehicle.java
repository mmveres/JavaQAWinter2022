package ua.univer.lesson07.vehicles;

import java.util.Scanner;

public class ProgramVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        while (true) {
            System.out.println("1. Generate 3 vehicles ");
            System.out.println("2. print all  ");
            System.out.println("3. getMaxSpeedVehicle ");
            System.out.println("4. getMinAgeVehicle ");
            System.out.println("0. Exit ");
            String answer = sc.next();
            switch (answer) {
                case "1":
                    vehicles[0] = new Car(1, "Ford", 120, 5);
                    vehicles[1] = new Ship(2, "Ship1", 20, 10, "Odessa", 100);
                    vehicles[2] = new Plane(3, "An24", 500, 20, 24, 1000);
                    break;
                case "2":
                    for (int i = 0; i < vehicles.length; i++) {
                        System.out.println(vehicles[i]);
                    }
                    break;
                case "3":
                    Vehicle maxSpeedVehicle = VehicleService.getMaxSpeedVehicle(vehicles);
                    System.out.println(maxSpeedVehicle);
                    break;
                case "4":
                    Vehicle minAgeVehicle = VehicleService.getMinAgeVehicle(vehicles);
                    System.out.println(minAgeVehicle);
                    break;
                case "0":
                    System.out.println("Exit");
                    return;
            }
        }
    }
}
