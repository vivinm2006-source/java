package day5;
import java.util.*;
public class sum_of_digit
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int ld = num%10;

        while(num>=10)
        {
            num/=10;
        }
        int fd = num;
        int sum = ld+fd;
        System.out.print(sum);
    }
}