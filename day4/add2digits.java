package day4;

import java.util.Scanner;

public class add2digits {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sk.nextInt();
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            num = sum;
        }
        System.out.println("Result: " + num);
    }
}
