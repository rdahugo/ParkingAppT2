package com.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingApp {

    public static List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        settingVehicles();
        parkingResume();
    }

    public static void settingVehicles() {

        int min = 1;
        int max = 1000;

        int lotteryNumber = (int) (Math.random() * (max - min + 1) + min);

        try {
            Vehicle car1 = new Car(0.5);
            Vehicle car2 = new Car(1);
            Vehicle car3 = new Car(2.5);
            vehicles.add(car1);
            vehicles.add(car2);
            vehicles.add(car3);

            Vehicle motorcycle1 = new Motorcycle(0.5);
            Vehicle motorcycle2 = new Motorcycle(3.3);
            Vehicle motorcycle3 = new Motorcycle(6.25);
            vehicles.add(motorcycle1);
            vehicles.add(motorcycle2);
            vehicles.add(motorcycle3);

            Vehicle truck1 = new Truck(96.9, lotteryNumber);
            Vehicle truck2 = new Truck(18, lotteryNumber);
            Vehicle truck3 = new Truck(4, lotteryNumber);
            vehicles.add(truck1);
            vehicles.add(truck2);
            vehicles.add(truck3);

        } catch (Exception e) {
            System.out.println("\n*** ERROR - Something happened! - ***");
        }

    }

    public static void parkingResume() {

        for (Vehicle vehicle : vehicles) {

            System.out.println();
            System.out.println("Vehicle: " + vehicle.description());
            System.out.println("Parking Time: " + vehicle.getTimeParking());
            System.out.println("Parking Fee: " + vehicle.getTotalAmount());
        }
    }
}
