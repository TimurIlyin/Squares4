package com.TimIl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Площадь какой фигуры ищем?\n 1 - Треугольник;\n 2 - Четырехугольник;\n 3 - Эллипс;");
        int figure = in.nextInt();

        switch (figure) {
            case 1: {
                System.out.println("Какой это треугольник?\n 1 - Прямоугольный;\n 2 - Равнобедренный;\n 3 - Произвольный");
                int type1 = in.nextInt();
                switch (type1) {
                    case 1:
                        double base;
                        double hight;
                        System.out.println("Введите основание и высоту: ");
                        base = in.nextDouble();
                        hight = in.nextDouble();
                        Right right1 = new Right(base, hight);
                        System.out.println("Площадь прямоугольного треугольника = " + right1.TotalSquare(base, hight, 1));

                        break;
                    case 2: {
                        System.out.println("Введите основание и высоту: ");
                        base = in.nextDouble();
                        hight = in.nextDouble();
                        Isosceles isosceles1 = new Isosceles(base, hight);
                        System.out.println("Площадь равнобедренного треугольника = " + isosceles1.TotalSquare(base, hight, 1));
                    }
                    break;
                    case 3: {
                        System.out.println("Введите основание и высоту: ");
                        base = in.nextDouble();
                        hight = in.nextDouble();
                        Triangle triangle1 = new Triangle(base, hight);
                        System.out.println("Площадь вашего треугольника = " + triangle1.TotalSquare(base, hight, 1));
                    }
                    break;
                    default:
                        System.out.println("Введены неверные данные!");
                }
            }
            break;
            case 2: {
                System.out.println("Какой это четырехугольник?\n 1 - Квадрат;\n 2- Прямоугольник;\n 3 - Трапеция;\n");
                int type2 = in.nextInt();
                switch (type2) {
                    case 1: {
                        double side1;
                        System.out.println("Введите сторону: ");
                        side1 = in.nextDouble();
                        Square square1 = new Square(side1, side1);
                        System.out.println("Площадь квадрата = " + square1.TotalSquare(side1, side1, 1));
                    }
                    break;
                    case 2: {
                        double side1, side2;
                        System.out.println("Введите стороны: ");
                        side1 = in.nextDouble();
                        side2 = in.nextDouble();
                        Rectangle rectangle1 = new Rectangle(side1, side2);
                        System.out.println("Площадь прямоугольника = " + rectangle1.TotalSquare(side1, side2, 1));
                    }
                    break;
                    case 3: {
                        double base1, base2, hight;
                        System.out.println("Введите основания и высоту: ");
                        base1 = in.nextDouble();
                        base2 = in.nextDouble();
                        hight = in.nextDouble();
                        Trapeze trapeze1 = new Trapeze(base1, base2, hight);
                        System.out.println("Площадь трапеции = " + trapeze1.TotalSquare(base1, base2, hight));
                    }
                    break;
                    default:
                        System.out.println("Введены некорректные данные");
                }
            }
            break;
            case 3: {
                System.out.println("Какой это эллипс?\n 1 - Круг;\n 2 - Эллипс;\n");
                int type3 = in.nextInt();
                switch (type3) {
                    case 1: {
                        double radius1;
                        System.out.println("Введите радиус окружности: ");
                        radius1 = in.nextDouble();
                        Circle circle1 = new Circle(radius1);
                        System.out.println("Площадь круга = " + circle1.TotalSquare(radius1, radius1, 1));
                    }
                    break;
                    case 2: {
                        double radius1, radius2;
                        System.out.println("Введите радиусы эллипса: ");
                        radius1 = in.nextDouble();
                        radius2 = in.nextDouble();
                        Ellipse ellipse1 = new Ellipse(radius1, radius2);
                        System.out.println("Площадь эллипса = " + ellipse1.TotalSquare(radius1, radius2, 1));
                    }
                    break;
                    default:
                        System.out.println("Введены некорректные данные!");
                }
            }
            break;
            default:
                System.out.println("Введены некорректные данные!");
        }
    }
}