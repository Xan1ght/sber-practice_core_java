package ru.sber.base.syntax;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String palindrome = uInput.nextLine();
        int palindromeLength = palindrome.length();
        boolean isPalindrome = true;
        if (palindromeLength > 1) {
            int i = 0;
            while (isPalindrome && palindromeLength / 2 != i) {
                if (palindrome.charAt(i)
                        != palindrome.charAt(palindromeLength - i - 1)) {
                    isPalindrome = false;
                }
                i++;
            }
        }
        System.out.print(isPalindrome ?
                "Является палиндромом"
                : "Не является палиндромом");
    }
}