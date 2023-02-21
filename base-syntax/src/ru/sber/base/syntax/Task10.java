package ru.sber.base.syntax;

import java.util.Scanner;
public class Task10 {
    public static void main (String[] args) {
        String[] aRoman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        int[] iRoman = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        Scanner uInput = new Scanner(System.in);
        int number = uInput.nextInt();
        int i = 8;
        while (number > 0) {
            while (number < iRoman[i]) {
                i--;
            }
            System.out.print(aRoman[i]);
            number -= iRoman[i];
        }
    }
}