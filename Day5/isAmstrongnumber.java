package Day5;
import java.util.*;
import java.util.Scanner;
public class isAmstrongnumber {
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = s.nextInt();
        int orginal = num;
        int sum =0;
        while(num!=0)
        {
            int pop = num%10;
            sum+=pop*pop*pop;
            num/=10;
        }
        if(orginal==sum)
        {
            System.out.print("Amstrong number");
        }
        else {
            System.out.print("Not an amstrong number");
        }

    }
}