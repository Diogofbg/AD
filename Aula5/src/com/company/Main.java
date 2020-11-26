package com.company;

import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {

        Point x = new Point(10,20);
        Point y = new Point(25,50);
        double setDistance = x.distanceTo(y);
        System.out.println(setDistance);

        Point a = new Point(0,3);
        Point b = new Point(0,0);
        Point c = new Point(3,0);

        Triangle LL = new Triangle();
        Triangle L = new Triangle(a, b, c);


        System.out.println(L.Area());

        Point t = new Point(0,5);
        Point h = new Point(1,1);
        Rectangle rt = new Rectangle(new Point(0,5),5,5);

        boolean contains = rt.contains(h);
        System.out.println(contains);

    }

}
