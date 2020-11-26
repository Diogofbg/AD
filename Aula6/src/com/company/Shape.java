package com.company;

public abstract class Shape{

    protected Point position;

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
