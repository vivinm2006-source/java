package day5;
import java.util.*;
public class min
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int min = 9;
        while(num!=0)
        {
            int pop = num%10;
            if(pop<min)
            {
                min = pop;
            }
            num/=10;
        }
        System.out.print(min);
    }
}