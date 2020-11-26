package com.company;

public class Rectangle extends Shape{

    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        topLeftPoint = new Point();
       height = 0.0;
       width = 0.0;
    }

    public Rectangle (Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    public boolean contains(Point p){
        Point bottomLeft = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        Point topRight = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRight = new Point(topLeftPoint.getX() + height, topLeftPoint.getY() - height);

        if(p.x > bottomLeft.getX() && p.getX() < bottomRight.getX() && p.getY() > bottomLeft.getY() && p.getY() > topRight.getY()){
            return true;
        }
        else{
            return false;
        }

    }



}
