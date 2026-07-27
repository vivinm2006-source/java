package day8;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,7,9,2};
        for(int i=0; i<arr.length; i++) {
            int minindex=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[minindex])
                    minindex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        for (int num:arr) {
            System.out.println(num);
        }
    }
}
