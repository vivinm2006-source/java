package Day5;
import java.util.*;
public class sumofodd
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int sum =0;
        int evensum=0;
        int oddsum=0;
        while(num!=0)
        {
            int pop = num%10;
            if(pop%2==0)
            {
                evensum+=pop;
            }
            else {
                oddsum+=pop;
            }
            sum+=pop;
            num/=10;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Even sum = "+evensum);
        System.out.println("Odd sum = "+oddsum);
    }
}