package com.parking;

public class Truck extends Vehicle implements ICalculateFeeDiscount{

    //Día completo: 15000
    //Fracción: 15000/24 = 625
    //Menos de un día (entre 00:01 minuto y 23:59 horas): 10000
    //Sorteo: número aleatorio entre 1 y 1000, paga el mínimo (2000)

    public Truck(double timeParking, int lotteryNumber) {
        super(timeParking);
        calculateFee(timeParking, lotteryNumber);
    }

    @Override
    public void calculateFee(double timeParking, int lotteryNumber) {

        double day = timeParking / 24;
        int num = (int)day;
        double totalAmount = num * 15000;

        if(day - (double)num > 0){
            totalAmount += 10000;
        }

        if (lotteryNumber == lotteryNumber()){
            totalAmount = 2000;
        }

        setTotalAmount(totalAmount);
    }

    public int lotteryNumber(){

        int min = 1;
        int max = 1000;

        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public String description() {
        return "Truck";
    }

}
