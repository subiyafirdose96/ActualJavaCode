package Package1.ArraysProgram;
//Write a Java program to check if a given string has all unique characters
// //[Input:String a ="rtrrutwe" Output:Unique Characters=[w,e]]

import java.util.Arrays;

public class ArraySort_DescendingOrder {

        public static void main(String[] args) {
            int [] arr={12, 30, 20, 5, 15};
            //output: [30, 20, 15, 12, 5]
            int temp=0;
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j]>arr[i]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }}
                }
                System.out.println(Arrays.toString(arr));
                }
        }


