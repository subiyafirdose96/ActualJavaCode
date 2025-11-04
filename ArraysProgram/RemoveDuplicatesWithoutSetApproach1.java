package Package1.ArraysProgram;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesWithoutSetApproach1 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 8, 4, 8};
        //output = [2, 4, 5, 8]
        // here we are comparing i and i+1, for last element we will not have any element in RHS
        // to compare, hence we store it K and later compare with "result" to check element present.
        int k=arr.length-1;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] != arr[i + 1]) {
                if(!result.contains(arr[i])){
                result.add(arr[i]);
            }}

            //To print the last element if it doesn't exist
        if(!result.contains(arr[k])) {
            result.add(arr[k]);
        }}
            System.out.println(result);
        }
    }

