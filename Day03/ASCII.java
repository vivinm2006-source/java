package Day03;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int b=input.nextInt();

        for(char ch='a';ch<='z';ch++){
            System.out.println("the ascii value "+ ch +" is "+  (int)ch);
        }
    }
}
