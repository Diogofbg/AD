package com.company;

public class Circle extends Shape {

    protected double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(Point position, double radius){
        this.position=position;
        this.radius=radius;
    }
    public Circle(){
        super();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public Point getPosition() { return super.getPosition(); }

    @Override
    public void setPosition(Point position) { super.setPosition(position); }
}
