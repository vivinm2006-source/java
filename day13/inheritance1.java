//package day13;
//class C{
//    C(){
//        super();
//        System.out.println("print the value C ");
//    }
//    C(int c){
//        this();
//        System.out.println("print the value C "+c);
//    }
//}
//class D extends C{
//    D(){
//
//    }
//    D(int c,int d){
//
//    }
//    D(int c){
//        this();
//    }
//}
//
//public class inheritance1 {
//    public static void main(String[] args){
//        D d=new D(10);
//    }
//}
package day13;

class E {
    E() {
        super();
        System.out.println("print the value E");
    }

    E(int c) {
        this();
        System.out.println("print the value E " + c);
    }
}

class F extends E {

    F() {
        super();
    }

    F(int c) {
        this();
    }

    F(int c, int d) {
        super(c);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        F f = new F(10);
    }
}
