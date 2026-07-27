package day8;

public class linear_2D_array {
    public static void main(String[] args) {
        int[][] name1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int target = 4;

        if (ls(name1, target)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    public static boolean ls(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}