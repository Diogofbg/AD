package com.company;

public abstract class Vehicle {
    protected int year;
    protected String brand;
    protected String model;
    protected int price;
    protected String color;

    public Vehicle(){
        this.year = 0;
        this.brand ="";
        this.color ="";
        this.model="";
        this.price=0;
    }

    public Vehicle(final int year, final String brand, final String model, final int price, final String color){
        this.year = year;
        this.brand =brand;
        this.model = model;
        this.price= price;
        this.color=color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
