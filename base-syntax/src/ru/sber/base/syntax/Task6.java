package ru.sber.base.syntax;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int number = uInput.nextInt();
        int divider = 3;
        boolean isPrime = true;
        if ((number % 2 != 0 || number == 2) && number > 1) {
            while (divider <= Math.round(Math.sqrt(number)) && isPrime) {
                isPrime = number % divider != 0;
                divider += 2;
            }
        }
        else {
            isPrime = false;
        }
        System.out.print(isPrime ? "Простое" : "Составное");
    }
}