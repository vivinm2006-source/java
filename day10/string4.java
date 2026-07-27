//package day10;
//
//public class string4 {
//    public static void main(String[] args) {
//        String str = "The quick brown fox";
//        String[] fruits = str.split(",");
//
//        String str2 = "Hello world java";
//        String[] words = str2.split(" ");
//    }
//}


package day10;

public class string4 {
    public static void main(String[] args) {

        String str = "The quick brown fox";
        String[] fruits = str.split(",");

        for (String s : fruits) {
            System.out.println(s);
        }

        String str2 = "Hello world java";
        String[] words = str2.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}