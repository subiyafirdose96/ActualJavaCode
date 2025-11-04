package Package1.ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEvenFirstOddNext {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 7, 6};
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        int[] arr2=new int[arr.length];
        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){
                even.add(arr[i]);
            }
        else {
            odd.add(arr[i]);
            }
        }
        even.addAll(odd);
            System.out.println(even);

    }
}
