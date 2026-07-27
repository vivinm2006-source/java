package day4;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("false");
            return;
        }
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (original == reverse) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}