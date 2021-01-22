package com.company;

public class MobileDevice implements Comparable<MobileDevice>{

    private  CPU cpu;
    private  int year;
    private  String brand;
    private  String model;
    private  int serialNumber;

    public MobileDevice(){
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.serialNumber = 0;
        this.cpu = new CPU();
    }

    public MobileDevice(String brand, String model, int year, int serialNumber, CPU cpu) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.serialNumber = serialNumber;
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getYear() {
        return year;
    }

    public CPU getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "MobileDevice{" +
                "cpu=" + cpu +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public int compareTo(MobileDevice other) {
        return this.year - other.year;
    }
}
