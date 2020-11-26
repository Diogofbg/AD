package com.company;

public class Triangle extends Shape{
    public Point a;
    public Point b;
    public Point c;

    public Triangle() {
         a = new Point();
         b = new Point();
         c = new Point();
    }

    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA(){
        return a;
    }

    public Point getB(){
        return b;
    }

    public Point getC(){
        return c;
    }

    public double getBase(){
        return a.distanceTo(b);
    }

    @Override
    public double getArea() {
        double base = getBase();
        double hip = b.distanceTo(c);
        double area = (base * hip)/2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimetro = getBase() + b.distanceTo(c) + c.distanceTo(a);
        return perimetro;
    }
}
