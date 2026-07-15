package Day02;

import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        //ADDiTION

        int c = a + b;
        System.out.println("Addition: " + c);

        c = 0;
        c = a - b;
        System.out.println("Sub: " + c);
        c = 0;
        //Multiple
        c = a * b;
        System.out.println("Multiple: " + c);

        //Div
        c = 0;
        c = a / b;
        System.out.println("Division: " + c);
        c = 0;
        //mod
        c = a % b;
        System.out.println("mod:  " + c);

    }
}