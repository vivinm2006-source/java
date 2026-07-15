package Day5;
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 2;

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        while (i < n) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
            i++;
        }

        System.out.println("Prime");
    }
}