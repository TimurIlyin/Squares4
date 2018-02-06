package com.TimIl;

public class Ellipses implements Squares {
    //Вычисление площадей эллипсов
    double radius1, radius2;

    public Ellipses(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    @Override
    public double TotalSquare(double side, double hight, double base) {
        double square;
        square = Math.PI * radius1 * radius2;
        return square;
    }
}
