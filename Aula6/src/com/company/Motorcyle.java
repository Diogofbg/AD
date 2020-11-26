package com.company;

public class Motorcyle extends Vehicle {

    public Motorcyle(){
        super();
    }

    public Motorcyle(final int year, final String brand, final String model, final int price, final String color){
        super(year, brand, model, price, color);
    }

    @Override
    public String toString() {
        return "Motorcyle{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
