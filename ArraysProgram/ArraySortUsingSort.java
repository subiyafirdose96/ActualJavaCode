package Package1.ArraysProgram;

import java.util.Arrays;

public class ArraySortUsingSort {
    //we can use same logic for sorting string and char too
    public static void main(String[] args) {
        //int [] arr={12, 30, 20, 5, 15};
        //char[] arr={'Z', 'H', 'A'};
        String [] arr={"FGB", "ABC", "QWS","BVC"};

        System.out.println("array before sorting");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("array after sorting");
        System.out.println(Arrays.toString(arr));
}}
