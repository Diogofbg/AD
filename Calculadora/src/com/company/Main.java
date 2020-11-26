package com.company;

public class Main {

    public static void main(String[] args) {
	Calculator c = new Calculator();
	c.setValue(5);
	c.add(10);

    }

    public static class Calculator {
        private double value;

        public Calculator() {
            value = 0.0;
        }
        public double getValue(){
            return value;
        }
        public void setValue(
                double newValue) {
            value = newValue;
        }
        public void clear(){
            value = 0.0;
        }
        public void add(double term){
            value += term;
        }
    }

}
