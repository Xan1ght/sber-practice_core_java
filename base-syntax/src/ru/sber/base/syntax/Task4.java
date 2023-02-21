package ru.sber.base.syntax;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String number = uInput.nextLine();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.print(sum);
    }
}