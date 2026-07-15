package Day5;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Largest_value {
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int largest=0;
        while (a!=0){
            int pop=a%10;
            if(pop>largest){
                largest=pop;
            }

            a=a/10;
        }

        System.out.println(largest);
    }
}
