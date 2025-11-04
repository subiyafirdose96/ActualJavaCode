package Package1.ArraysProgram;

import java.util.Arrays;

public class FindSecondLargestFromMissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2, 3,5, 7};
        int n=arr.length+2;// add number of missing elements
        int l=n-arr.length;
        int[] arr2=new int[n-l];
        int index=0;

        for(int i=1; i<=n; i++){
            boolean flag=false;
            for(int j=0; j<arr.length; j++){// put arr.length as you are iterating on array in "j"
                if(arr[j]==i){
                    flag=true;
                    break;
                }}
            if(flag==false) {
                arr2[index++] = i;
                System.out.println(Arrays.toString(arr2));

                int lar = arr[0];
                int lar2 = arr[1];

                for (int k = 0; k < arr2.length; k++) {
                    if (arr2[k] > lar) {
                        lar2 = lar;
                        lar = arr2[k];
                    }
                    if (arr2[k] > lar2 && arr2[k] != lar) {
                        lar2 = arr2[k];
                    }
                }
                //System.out.println(lar);
                System.out.println(lar2);


            }}}
            }
