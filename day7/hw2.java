package day7;

public class hw2 {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int largest =0;
        int secondLargest=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int current = arr[i][j];
                if(current>largest){
                    secondLargest =largest;
                    largest = current;
                }
                else if(current>secondLargest && current!=largest){
                    secondLargest =current;
                }
            }
        }
        System.out.println("Largest number : "+largest);
        System.out.println("Second Largest number : "+secondLargest);

    }
}

