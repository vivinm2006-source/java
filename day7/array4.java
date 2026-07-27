package day7;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int[]id ={1,2,3,4,5,6,7,8,9,10};
        int length = id.length;
        int sum = 0;
        for(int num:id){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
