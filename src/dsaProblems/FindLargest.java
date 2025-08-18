package dsaProblems;

public class FindLargest {
    public static void largest(int[] arr){
        int largest = arr[0];
        for(int num : arr){
            if(num > largest){
                 largest = num;
            }
        }
        System.out.println("Largest : "+largest);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        largest(arr);
    }
}
