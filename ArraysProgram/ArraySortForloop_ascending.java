package Package1.ArraysProgram;

import java.util.Arrays;

public class ArraySortForloop_ascending {
    public static void main(String[] args) {
        int [] arr={12, 30, 20, 5, 15};
        //output: [5, 12, 15, 20, 30]

        int temp=0;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(arr));
    }
}
