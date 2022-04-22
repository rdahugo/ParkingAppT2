package com.parking;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {

    @Test
    public void calculateFeeAboveMin() {
        double result = 70000;
        Truck vTruck = new Truck(96.9,3);
        Assert.assertEquals(result, vTruck.getTotalAmount(), 0.001);
    }

    @Test
    public void calculateFeeUnderMin() {
        double result = 10000;
        Truck vTruck = new Truck(4,3);
        Assert.assertEquals(result, vTruck.getTotalAmount(), 0.001);
    }

    @Test
    public void description() {
        String result = "Truck";
        Truck vTruck = new Truck(2,3);
        Assert.assertEquals(result, vTruck.description());

    }
}