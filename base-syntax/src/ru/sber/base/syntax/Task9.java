package ru.sber.base.syntax;

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("a = ");
        float a = uInput.nextInt();
        System.out.print("b = ");
        float b = uInput.nextInt();
        System.out.print("c = ");
        float c = uInput.nextInt();
        float D = b*b - 4*a*c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.print("x1 = " + x1 + "\nx2 =" + x2);
        }
        else if (D == 0) {
            double x = -(b/(2*a));
            System.out.print("x = " + x);
        }
        else {
            System.out.print("Корней нет");
        }
    }
}