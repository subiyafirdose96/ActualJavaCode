package Package1.ArraysProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintFromSubset {
    public static void main(String[] args) {
        //int[] arr = {21,20,23,25,22,26,25};
        // Output = {22,26,25,21,20,23,25}
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        int n=sc.nextInt();

        int[] arr = new int[n];

        // Take array elements input
        System.out.print("Enter " + n + " elements: ");
        for(int j=0; j<n; j++){
            arr[j]= sc.nextInt();
        }

        ArrayList<Integer> list= new ArrayList<>();
        int k=n-3;//last 3 elements,9

        for(int i=k; i<n; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<k; i++){
            list.add(arr[i]);
        }
        System.out.println(list);

    }
}
