package day10;

public class problem {
    public static void main(String[] args) {
        String str = "hello world";

        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(ch);

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}