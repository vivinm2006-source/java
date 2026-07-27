public class pattern7 {
    public static void main(String[] args) {
        int nums = 5;
        for (int i = nums; i >= 1; i--) {
            for (int j = 1; j <= nums - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
