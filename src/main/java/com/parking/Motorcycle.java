package com.parking;

public class Motorcycle extends Vehicle {

    // Si la moto lleva 1 minuto hasta 3 horas, paga fijo 3000
    // Hora adicional después de las 3 horas: 1000
    // Fracción a partir de las 3 horas: 1000/60 (si estuvo 30 mins --> (1000/60)*30)


    public Motorcycle(double timeParking, double totalAmount) {
        super(timeParking, totalAmount);
    }

    @Override
    public String description() {
        return null;
    }
}
