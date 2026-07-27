package day8;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int[] arr = new int[n];
        int target = sk.nextInt();
        for (int i=0; i<n; i++) {
            arr[i] = sk.nextInt();
        }
        System.out.println(linear_search(arr, target));
    }
    static int linear_search(int[] arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
