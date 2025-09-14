package dsaProblems;

import java.util.Arrays;

public class quickSort {

    static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pv = partition(arr, low, high);

            //sort elements before and after partition
            quickSort(arr, low, pv - 1);
            quickSort(arr, pv + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pv = arr[low];
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= j && arr[i] <= pv) i++;
            while (i <= j && arr[j] > pv) j--;
            if (i > j) break;
            swap(arr, i, j);
        }

        swap(arr, low, j);

        return j;
    }
    static void swap(int arr[], int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 3, 1, 5};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


