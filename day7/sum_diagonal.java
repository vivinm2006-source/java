package day7;

public class sum_diagonal {
    public static void main(String[] args){
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int sum =0;
        int sum1 =0;
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                if(i==j){
                    sum = sum+arr1[i][j];
                }
                if(i+j==3-1){
                    sum1=sum1+arr1[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }

}

