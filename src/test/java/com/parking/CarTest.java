package com.parking;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void calculateFeeInt() {
        double result = 4000;
        Car vCar = new Car(2);
        Assert.assertEquals(result, vCar.getTotalAmount(), 0.001);
    }

    @Test
    public void calculateFeeDouble() {
        double result = 5000;
        Car vCar = new Car(2.5);
        Assert.assertEquals(result, vCar.getTotalAmount(), 0.001);
    }

    @Test
    public void description() {
        String result = "Car";
        Car vCar = new Car(2);
        Assert.assertEquals(result, vCar.description());

    }
}
