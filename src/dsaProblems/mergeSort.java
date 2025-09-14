package dsaProblems;

import java.util.Arrays;

public class mergeSort{

        public static void mergeSort(int arr[]){
        //if arr has less than or have 1 element then
        if(arr.length <= 1){
            return;
        }

        //divide arr into left and right parts
        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];

        //put elements in left and right arr
        for (int i=0;i<mid;i++){
            left[i] = arr[i];
        }

        for (int i=mid;i<arr.length;i++){
            right[i-mid] = arr[i];
        }


        //sort both the halves
        mergeSort(left);
        mergeSort(right);


        //merge two sorted halves
        merge(arr,left,right);

    }

    public static void merge(int ans[],int left[],int right[]){
        //defining index for left , right and ans arr
        int i=0;
        int j=0;
        int k=0;

        //compare left and right array's elements put smaller one
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        //put rest of left and right part into ans arr
        while(i < left.length){
            ans[k++] = left[i++];
        }

        while(j < right.length){
            ans[k++] = right[j++];
        }

    }




static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,5,3,1,8};
        mergeSort(arr);
        print(arr);
    }

}
