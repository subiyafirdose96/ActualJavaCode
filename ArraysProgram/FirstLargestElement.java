package Package1.ArraysProgram;

import java.util.Arrays;

public class FirstLargestElement {
    public static void main(String[] args) {
        int[] arr={123, 9, 25, 1, 99, 33};
        int max1=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];

            }
        }
        System.out.println(max1);
    }}

