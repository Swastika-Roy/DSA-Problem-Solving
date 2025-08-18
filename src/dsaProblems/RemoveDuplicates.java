package dsaProblems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void Remove(int arr[]){
        Set<Integer> st = new HashSet<>();
        for(int num : arr){
            st.add(num);
        }
        System.out.println(Arrays.toString(st.toArray()));
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,4,5,6};
        Remove(arr);
    }
}
