package day14;

interface A {
    void a();
}

interface C extends A {
    void display();
}

class B implements C {

    @Override
    public void a() {
        System.out.println("Method A");
    }

    @Override
    public void display() {
        System.out.println("Display Method");
    }
}

public class Interface {
    public static void main(String[] args) {

        C obj = new B();

        obj.a();
        obj.display();
    }
}