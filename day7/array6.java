package day6;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i=0;i<5;i++) {
            arr[i] = sk.nextInt();
        }
        for (int i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i=0;i<5;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
