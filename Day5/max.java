package day5;
import java.util.*;
public class max
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int max = 0;
        while(num!=0)
        {
            int pop = num%10;
            if(pop>max)
            {
                max = pop;
            }
            num/=10;
        }
        System.out.print(max);
    }
}