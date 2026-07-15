package Day03;

import java.util.Scanner;

public class else_if {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();

        if(a==b) {
            System.out.println("Equal numbers");
        }
        else{
            System.out.println("not Equal");
        }
    }
}
