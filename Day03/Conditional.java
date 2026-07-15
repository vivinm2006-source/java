package Day03;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        String c=(a%2==0)?"Even":"Odd";
        System.out.println(c);
    }
}
