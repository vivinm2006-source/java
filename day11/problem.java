package day11;

import java.util.Scanner;

//public class problem {
//    public static void main(String[] args) {
//        Scanner sk = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String str = sk.nextLine();
//        String[] words = str.split(" ");
//        for (String word : words) {
//            System.out.println(word + " = " + word.length());
//        }
//        sk.close();
//    }
//}

public class problem {
    public static void main(String[] args) {

        String name = "hello world and welcome to java programing";
        String[] name1 = name.split(" ");

        String longword = name1[0];

        for (String s : name1) {
            if (s.length() > longword.length()) {
                longword = s;
            }
        }

        System.out.println("Longest word: " + longword);
        System.out.println("Length: " + longword.length());
    }
}