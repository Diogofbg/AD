package com.company;

public class CPU {

    private int cores;
    private int bits;
    private int speed;

    // POR OMISSÃO
    public CPU(){
        this.cores = 0;
        this.bits = 0;
        this.speed = 0;
    }
    // POR PARAMETROS
    public CPU(int cores, int bits, int speed) {
        this.cores = cores;
        this.bits = bits;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "cores=" + cores +
                ", bits=" + bits +
                ", speed=" + speed +
                '}';
    }
}
