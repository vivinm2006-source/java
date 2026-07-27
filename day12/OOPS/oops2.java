package day12.OOPS;

import java.util.Scanner;

class G{
    int a;
    int b;
    String c;
    String d;
    G(int a) {
        this.a=a;
    }
    void display(int a){
        System.out.println(a);
    }
    G(){

    }
    void display(){
        System.out.println("display");
    }
    G(int a,int b){
        System.out.println(a+" "+ b);
    }
    G(int a,String c)
    {
        this.a=a;
        this.c=c;
    }
    void display(int a,String c){
        System.out.println(a +" "+ c);
    }
    G(String c){
        this.c=c;
    }
    void display(String c){
        System.out.println(c);
    }
    G(String c,String d) {
        this.c=c;
        this.d=d;
    }
    void display(String c,String d){
        System.out.println(c+ " "+ d);
    }
}

public class oops2 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int input = sk.nextInt();
        int input1 = sk.nextInt();
    }
}
