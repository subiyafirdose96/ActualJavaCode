package Package1.ArraysProgram;

import java.util.Arrays;

public class PrintFromSubsetReverse {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp;
        int n= arr.length;
        int k=5; //Number given to subset
        for(int i=0; i<n; i=i+k){
            int start=i;
            int end=Math.min(i+k-1, n-1);
                while(start<end){
                    temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                   start++;
                   end--;
                }
            }

            System.out.println("Reversed in groups: " + Arrays.toString(arr));
        }

    }

