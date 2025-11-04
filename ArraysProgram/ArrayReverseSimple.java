package Package1.ArraysProgram;

import java.util.Arrays;

public class ArrayReverseSimple {
    public static void main(String[] args) {
        int [] arr={6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        //Reverse array
        for(int i=arr.length-1;i>=0; i--){
            System.out.print(arr[i]+" ");

        }


    }
}
