package day7;

import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int[]id = {9,2,3,1,5,-2,10};
        int evensum=0;
        int oddsum=0;
        for(int num:id){
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
