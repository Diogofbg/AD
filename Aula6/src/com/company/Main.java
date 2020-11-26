package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle c = new Car();
        Vehicle m = new Motorcyle();

        Point b =  new Point(1,1);
        Shape circle =  new Circle(new Point(2,5), 5.5);
        Shape rt =  new Rectangle(new Point(0,5), 5,5);
        Shape triangle =  new Triangle(new Point(0,5),b,b);

        Figure fig = new Figure();
        fig.add(circle);
        fig.add(rt);
        fig.add(triangle);

        for (int i = 0; i < fig.getShapes().size(); i++) {
            Shape s = fig.getShapes().get(i);
            s.getArea();
            s.getPerimeter();

            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
        }

    }
}
