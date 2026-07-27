package day10;

public class string6 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hello");

        name.append(" world");

        name.replace(0, 9, "hello guys");

        System.out.println(name);
    }
}