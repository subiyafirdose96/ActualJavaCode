package Package1.ArraysProgram;

public class ArrayReverse {
    public static void main(String[] args) {
        //to reverse array, we need to swap element from position 0 to length-1
        //                                                        1 to length-2 so onn

        int[] arr= {1, 2, 3, 4,5, 6};

        //  we are taking j to swap using 3rd variable temp. 'j' refer to last index position and minus(--) it after each iteration
        int j= arr.length-1;
        int temp;
        for(int i=0; i<(arr.length-1)/2; i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;

        }
        for(int x: arr){
            System.out.println(x);
        }
    }
}
