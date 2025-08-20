package dsaProblems;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(SecondLargest(arr));
    }
    public static int SecondLargest(int arr[]){
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i=0; i < arr.length;i++){
            if(arr[i] > first){
               sec = first;
               first = arr[i];
            }else if(arr[i] > sec && arr[i] != first)
                sec = arr[i];
        }if(sec == Integer.MIN_VALUE) return -1;
         return sec;
    }
}
