package day7;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int[] id=new int[5];
        for(int i=0;i<5;i++){
            int a= sk.nextInt();
            id[i]=a;
        }
        for (int i=0;i<5;i++){
            System.out.println(id[i]);
        }
        for(int num:id){
            System.out.println(num);
        }
    }
}
