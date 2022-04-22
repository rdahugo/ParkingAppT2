package com.parking;

public class Motorcycle extends Vehicle implements ICalculateFee {

    // Si la moto lleva 1 minuto hasta 3 horas, paga valor fijo de 3000
    // Hora adicional después de las 3 horas: 1000
    // Fracción a partir de las 3 horas: 1000/60 (si estuvo 30 minutos --> (1000/60)*30)

    public Motorcycle(double timeParking) {
        super(timeParking);
        calculateFee(timeParking);
    }

    @Override
    public void calculateFee(double timeParking) {

        if (timeParking > 0 && timeParking <= 3) {
            setTotalAmount(3000);
        } else if (timeParking > 3) {
            setTotalAmount(3000 + (timeParking - 3) * 1000);
        }
    }

    @Override
    public String description() {
        return "Motorcycle";
    }
}
