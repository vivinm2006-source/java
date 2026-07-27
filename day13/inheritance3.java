package day13;
class animal{
    void makeSound(){
        System.out.println("sound made by animal");
    }
}
class dog extends animal{
    @Override
    void makeSound(){
        System.out.println("sound made by dog");
    }
}
public class inheritance3 {
}
