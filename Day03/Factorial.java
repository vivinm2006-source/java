package Day03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int pro=1;
        for(int i=1;i<=a;i++){
            pro=pro*i;

        }
        System.out.println(pro);




    }
}
