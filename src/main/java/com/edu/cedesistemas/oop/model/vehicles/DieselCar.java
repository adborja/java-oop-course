package com.edu.cedesistemas.oop.model.vehicles;

public class DieselCar extends Car{

    public DieselCar(double speed, String name, String type) {
        super(speed, name, type);
    }

    @Override
    public void tank() {
        System.out.println("Tanquear carro diesel");
    }

    @Override
    public void power() {
        System.out.println("Prender carro diesel");
    }

}
