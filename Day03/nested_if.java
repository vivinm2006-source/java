package Day03;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 5 == 0) {
            if (a % 3 == 0) {

                System.out.println("it Can be divided.........");

            }
        }
     else if(a%7==0)

    {
        System.out.println("helloooo");

    } else

    {
        System.out.println("coding is not having fun");
    }

}
}