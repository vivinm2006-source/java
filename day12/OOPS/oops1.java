package day12.OOPS;

import java.util.Scanner;

class F{
    int rev_int() {
        Scanner sk=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sk.nextInt();
        int rev = 0;
        while (num!=0){
            int pop = num%10;
            rev = rev*10+pop;
            num = num/10;
        }
        return rev;
    }
}

public class oops1 {
    public static void main(String[] args) {
        F obj = new F();
        int result = obj.rev_int();
        System.out.println("Reversed Number: " + result);
    }
}