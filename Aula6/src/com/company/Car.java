package com.company;

public class Car extends Vehicle {

    public Car(){
        super();
    }

    public Car(final int year, final String brand, final String model, final int price, final String color){
        super(year, brand, model, price, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
