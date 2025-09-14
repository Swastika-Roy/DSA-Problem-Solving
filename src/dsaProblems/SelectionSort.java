package dsaProblems;

import java.util.Arrays;

public class SelectionSort {
    static void selsort(int arr[]){
        //outer loop i stands for looping from very first index in order to find minindex
        for(int i=0; i < arr.length-1;i++){
            //pointing the minindex starting with 0th index then incremented it each time by 1
            int minid = i;
            //inner loop stands for checking each time whether every
            // element after the ith element is smaller than it or not
            for(int j=i+1; j < arr.length; j++){
                //if smaller than that will be minindex
                if(arr[minid] > arr[j]){
                    minid=j;
                }
            }
            //then swap that element of minindex with ith position element
            int temp = arr[i];
            arr[i] = arr[minid];
            arr[minid] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5};
        selsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

