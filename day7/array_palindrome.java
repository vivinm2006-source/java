package day7;

public class array_palindrome {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 1};
        int left = 0;
        int right = num.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (num[left] != num[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

