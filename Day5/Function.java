package day5;
import java.util.*;
public class Function
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int c =add1(num1,num2);
        System.out.println(c);
        add2(num1,num2);
        System.out.println(add3());
        add4();
    }
    // with parameter and with return tepe
    public static int add1(int a, int b)
    {
        return a+b;
    }
    // with paramter with out return type
    public static void add2(int a , int b)
    {
        System.out.println("hello");
    }
    // with out patameter with retutn type
    public static int add3()
    {
        return 1;
    }
    // with out parameter with out retrun thyep
    public static void add4()
    {
        System.out.println("hai");
    }

}