package day13;
class A{
    void display(){
        System.out.println("Hello World");
    }
}
class B extends A{
    void show(){
        System.out.println("Welcome to the show");
    }
}
class C extends B{
    void fly(){
        System.out.println("Welcome to the fly");
    }
}

public class inheritence {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        b.show();
        b.display();
        c.display();
        c.fly();
        c.show();
    }
}
