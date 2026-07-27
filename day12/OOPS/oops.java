package day12.OOPS;


    class A{
        int age;
        String name;
        void display(){
            System.out.println("display");
        }
    }

    public class oops {
        public void main(String[] args) {
            A obj = new A();
            A obj1 = new A();
            obj.display();
            obj1.display();
        }
    }

