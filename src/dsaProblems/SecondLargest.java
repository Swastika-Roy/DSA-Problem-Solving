package dsaProblems;

public class SecondLargest {
   public static int secLargest(int arr[]){
       int first = Integer.MIN_VALUE;
       int sec = Integer.MAX_VALUE;
        for (int num:arr){
            if(num > first){
                sec=first;
                first=num;
            } else if (num > sec && num!=first) {
                sec=num;
            }
        }
        return sec;
   }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(secLargest(arr));
    }
}
