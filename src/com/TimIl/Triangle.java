package com.TimIl;

public class Triangle implements Squares{

    //Вычисление площадей треугольника

    double side;
    double hight;

    public Triangle(double side, double hight) {
        this.side = side;
        this.hight = hight;
    }

    @Override
    public double TotalSquare(double side , double hight , double base) {
        double square = 0;
        if (side > 0 && hight > 0) {
            square = 0.5 * side * hight;
        }
        else System.out.println("Некорректные данные!");
        return square;
    }

    public double getSide() {
        return side;
    }

    public double getHight() {
        return hight;
    }
}
