package day4;

import java.util.Scanner;

public class number_crunching_2 {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        int num = sk.nextInt();
        int key = sk.nextInt();
        int count = 0;
        while(num!=0){
            int pop = num%10;
            if(pop==key){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
