package com.TimIl;

public class Quadrilateral implements Squares {
    //Вычисление площадей четырехугольников
    double side1, side2;

    public Quadrilateral(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double TotalSquare(double side1, double side2, double base) {
        double square = 0;
        if (side1 > 0 && side2 > 0) {
            square = side1 * side2;
        } else
            System.out.println("Введены некорректные данные!");
        return square;
    }
}
