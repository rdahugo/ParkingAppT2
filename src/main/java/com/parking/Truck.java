package com.parking;

public class Truck extends Vehicle{

    //Día completo: 15000
    //Fracción: 15000/24 = 625
    //Menos de un día (entre 00:01 minuto y 23:59 horas): 10000
    //Sorteo: numero aleatorio entre 1 y 1000, paga el mínimo (2000)

    public Truck(double timeParking, double totalAmount) {
        super(timeParking, totalAmount);
    }

    @Override
    public String description() {
        return null;
    }

}
