package com.parking;

public abstract class Vehicle {

    private double timeParking = 0;
    private double totalAmount = 0;

    public abstract String description();

    public Vehicle(double timeParking) {
        this.timeParking = timeParking;
    }

    public double getTimeParking() {
        return timeParking;
    }

    public void setTimeParking(int timeParking) {
        this.timeParking = timeParking;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
