package Day03;

import java.util.Scanner;

public class Switch_problem {
    public static void  main(String[]args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        char b = (char)a;

        switch (a) {
            case 'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case 'A':
            case'E':
            case'I':
            case'O':
            case'U':
                System.out.println("Vowels");

            default:
                System.out.println("Invaild Number");
        }
    }
}
