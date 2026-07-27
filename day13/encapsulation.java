package day13;
class J{
    private int a;
    private int b;
    private String name;
    J(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
    }
    void setID(int a,int b){
        this.a=a;
        this.b=b;
    }
    int getA(){
       return this.a;
    }
    int getB(){
        return this.b;
    }
    void display(){
        System.out.println(a+" "+b+" "+name);
    }
}
public class encapsulation {
    public static void main(String[] args) {
        J a=new J(10,20,"karthick");
        a.display();
    }
}
