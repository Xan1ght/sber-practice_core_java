package ru.sber.base.syntax;

import java.math.BigInteger;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.print("Введите n (2 < n < 100): ");
        int N = uInput.nextInt();
        BigInteger a = BigInteger.valueOf(1), b = BigInteger.valueOf(1), c;
        System.out.println("0\n" + a + "\n" + b);
        for (int i = 0; i < N - 3; i++) {
            c = b;
            b = b.add(a);
            a = c;
            System.out.println(b);
        }
    }
}