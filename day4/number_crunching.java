package day4;

import java.util.Scanner;

public class number_crunching {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        while(num!=0) {
            int pop = num%10;
            if(pop==0){
                System.out.println("My number contains zero");
                break;
            }
            num=num/10;
        }
    }
}
