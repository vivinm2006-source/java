package day5;
import java.util.*;
public class spynumber
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        int product =1;
        while(num!=0)
        {
            int pop = num%10;
            sum += pop;
            product *= pop;
            num/=10;
        }
        if(sum==product)
        {
            System.out.print("The number is spy number");
        }
        else
        {
            System.out.print("The number is not spy number");
        }
    }
}