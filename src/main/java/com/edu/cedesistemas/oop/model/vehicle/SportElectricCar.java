package com.edu.cedesistemas.oop.model.vehicle;

public class SportElectricCar extends ElectricCar {
    public SportElectricCar(double speed, String name, String type) {
        super(speed, name, type);
    }

    //Polimorfismo
    @Override
    public void power() {
        super.power();
        System.out.println("Prendiendo carro Electrico Sport");
    }
}
