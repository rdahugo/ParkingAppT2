package com.parking;

public class Car extends Vehicle{

    // Paga por hora 2000
    // Si el carro supera el tiempo minimo de entrada (entre 1 min y 1 hora),
    // paga por menos de 1 hora: 1000

    /*
    P: Entonces si el vehiculo estuve 2,5 horas debe pagar 3 horas entonces serian 6.000?
    R: Paga 2 horas, 4000 y 30 minutos como es memos de la hora son 1000. Pagaría 5000.
     */
    public Car(double timeParking, double totalAmount) {
        super(timeParking, totalAmount);
    }

    @Override
    public String description() {
        return null;
    }
}
