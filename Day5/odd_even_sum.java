package Day5;

import java.util.Scanner;

public class odd_even_sum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int even=0;
        int odd=0;
        while (num!=0){
            int pop=num%10;

            if(pop%2==0){
                even+=pop;
            }
            else{
                odd+=pop;
            }
            num+=pop;
            num=num/10;

        }

        System.out.println("the Sum is:"+num);
        System.out.println("the Odd sum is:"+odd);
        System.out.println("the Even sum is :"+even);

    }
}
