package day5;
import java.util.*;
public class isprime2
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count =0;
        int i = 1;
        while(i<=num)
        {
            if(num%i==0)
            {
                count ++;
            }
            i ++;
        }
        if(count==2)
        {
            System.out.print("prime");
        }
        else {
            System.out.print("Not prime");
        }
    }
}