package dsaProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,9,5,4,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
