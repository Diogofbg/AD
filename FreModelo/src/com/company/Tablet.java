package com.company;

public class Tablet extends MobileDevice {
    private boolean supportsPen;

    public Tablet() {
        super();
        this.supportsPen = false;
    }

    public Tablet(String brand, String model, int year, int serialNumber, CPU cpu, boolean supportsPen) {
        super(brand, model, year, serialNumber, cpu);
        this.supportsPen = supportsPen;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "supportsPen=" + supportsPen +
                '}';
    }
}
