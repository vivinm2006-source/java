package Day03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        switch (a){
            case 1:
                if(a==1){
                    System.out.println("Sunday");
                }

                break;
            case 2:
                if(a==2){
                    System.out.println("Monday");
                }

                break;

            case 3:
                if(a==3) {
                    System.out.println("Tuesday");
                }

            break;

            case 4:
                if(a==4){
                    System.out.println("Wednesday");
                }

            break;
            case 5:
                if(a==5){
                    System.out.println("Thursday");
                }

            break;
            case 6:
                if(a==6) {
                    System.out.println("Friday");
                }
                break;
            case 7:
                if(a==7){
                    System.out.println("Saturaday");
                }
                break;

            default:
                System.out.println("Invaild");

        }
    }
}
