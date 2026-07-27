package day12.OOPS;

class C {
    int id;
    String name;
    String name1;

    C(int id) {
        this.id = id;
    }

    C(String name) {
        this.name = name;
    }

    C(String name1, String name) {
        this.name1 = name1;
        this.name = name;
    }

    C(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + name1);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        C obj = new C(10);
        C obj1 = new C(10, "KKK");

        obj.display();
        obj1.display();
    }
}