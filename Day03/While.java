package Day03;

import java.util.Scanner;

public class While {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        while(num!=0){
            int pop=num%10;
           count++;
            num/=10;


        }
        System.out.println(count);
    }
}

