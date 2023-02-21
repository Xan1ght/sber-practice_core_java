package ru.sber.base.syntax;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("a = ");
        int a = uInput.nextInt();
        System.out.print("b = ");
        int b = uInput.nextInt();
        System.out.print(a + " / " + b
                + " = " + a/b + " и "
                + a%b + " в остатке");
    }
}