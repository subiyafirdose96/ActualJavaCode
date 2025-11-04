package Package1.ArraysProgram;

public class MoveArrayRightByK {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int n = arr.length - 1;
        for (int i=0; i<k; i++){
            int last=arr[n];
        for(int j=n; j>0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0]=last;
    }
        for(int num:arr){
            System.out.println(num);
        }
}}