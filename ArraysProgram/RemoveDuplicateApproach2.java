package Package1.ArraysProgram;

public class RemoveDuplicateApproach2 {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 4};
        int j=0;
        int k=arr.length-1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]= arr[k];


        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }    }

}

