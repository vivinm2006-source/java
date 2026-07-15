package Day5;
import java.util.*;
public class Strong_number
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int num = s.nextInt();
        int orginal = num;
        int fact =1;
        int sum =0;
        while(num!=0)
        {
            int pop = num%10;
            for(int i =0;i<pop;i++)
            {
                fact = sum*i;
            }
            sum+=fact;
            num/=10;
        }
        if(fact==orginal)
        {
            System.out.print("The number is strong number");
        }
        else {
            System.out.print("The number is strong number");
        }

    }
}