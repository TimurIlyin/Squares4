package com.TimIl;

public class Trapeze extends Quadrilateral{
    public Trapeze(double side1, double side2 , double base) {
       // double base1;
        super(side1, side2);
    }
    @Override
    public double TotalSquare (double base1, double base2, double hight){
        double square;
        square = 0.5 * (base1 + base2) * hight;
        return square;
    }
}
