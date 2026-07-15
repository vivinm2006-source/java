package day5;
import java.util.*;
public class remove0
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = s.nextInt();
        int result =0;
        int rev=0;

        while(num!=0)
        {
            int pop = num%10;
            if(pop!=0)
            {
                result = result*10+pop;
            }
            num/=10;
        }
        while(result!=0)
        {
            int dig =result %10;
            rev = rev*10+dig;
            result/=10;
        }
        System.out.print(rev);
    }
}