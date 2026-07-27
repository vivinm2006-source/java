package day11;

import java.util.Arrays;
public class anagram_check {
    public static void main(String[] args) {
        String name="listen";
        String name1="silent";
        if(name.length()!=name1.length()){
            System.out.println("not an anagram");
        }
        char[] arr=name.toCharArray();
        char[] arr1=name1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}