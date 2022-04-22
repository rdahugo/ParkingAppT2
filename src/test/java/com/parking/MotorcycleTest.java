package com.parking;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorcycleTest {

    @Test
    public void calculateFeeUnderMin() {
        double result = 3000;
        Motorcycle vMotorcycle = new Motorcycle(2);
        Assert.assertEquals(result, vMotorcycle.getTotalAmount(), 0.001);
    }

    @Test
    public void calculateFeeAboveMin() {
        double result = 3300;
        Motorcycle vMotorcycle = new Motorcycle(3.3);
        Assert.assertEquals(result, vMotorcycle.getTotalAmount(), 0.001);
    }

    @Test
    public void description() {
        String result = "Motorcycle";
        Motorcycle vMotorcycle = new Motorcycle(2);
        Assert.assertEquals(result, vMotorcycle.description());

    }
}