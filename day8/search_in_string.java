package day8;

import java.util.Scanner;

public class search_in_string {
    public static void main(String[] args) {
        String name = "hello world";
        char[] name1 = name.toCharArray();
        char target = 'd';
        if (ls(name1, target)) {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }

    }
    static boolean ls(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

}
