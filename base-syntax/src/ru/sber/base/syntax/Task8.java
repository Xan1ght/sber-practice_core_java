package ru.sber.base.syntax;

import java.util.Random;
import java.util.Scanner;
public class Task8 {
    private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }

    public static void main(String[] args) {
        char rLetter = randomChar();
        Scanner uInput = new Scanner(System.in);
        char uLetter;
        do {
            uLetter = uInput.nextLine().charAt(0);
            if (uLetter < rLetter) {
                System.out.println("You’re too low");
            }
            else if (uLetter > rLetter) {
                System.out.println("You’re too high");
            }
        } while (uLetter != rLetter);
        System.out.print("Right");
    }
}