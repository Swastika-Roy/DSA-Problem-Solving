package dsaProblems;

import java.util.Arrays;

public class MergeTwoArrays {
    // Merge arr2 into arr1 (which has extra space at the end)
    public static void mergeSorted(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;      // last index of arr1's initial elements
        int j = n - 1;      // last index of arr2
        int k = m + n - 1;  // last index of merged array

        // Merge from the end into arr1
        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int m = 5, n = 5;
        int arr1[] = new int[m + n];   // bigger array with extra space
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        int arr2[] = {4, 5, 6, 7, 8};

        mergeSorted(arr1, m, arr2, n); // merge second array into first

        // Print merged result
        System.out.println(Arrays.toString(arr1));
    }
}
