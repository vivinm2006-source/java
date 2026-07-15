package Day03;

import java.util.Scanner;

public class Table_for {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=1;i<=20;i++)
        {
            int c=a*i;
            System.out.println(c);
        }
    }
}
