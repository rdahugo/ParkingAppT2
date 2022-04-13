package com.parking;

public abstract class Vehicle {

    private double minAmmount;
    private double ammount;
    private int parkingTime;

    public Vehicle(double minAmmount, double ammount, int parkingTime) {
        this.minAmmount = minAmmount;
        this.ammount = ammount;
        this.parkingTime = parkingTime;
    }

    public double getMinAmmount() {
        return minAmmount;
    }

    public void setMinAmmount(double minAmmount) {
        this.minAmmount = minAmmount;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public int getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }
}
