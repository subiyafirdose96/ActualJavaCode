package Package1.ArraysProgram;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int[] arr={123, 9, 25, 1, 99, 33};
        int min = arr[0], max = arr[0];

        //you can also use general for loop
        for( int digit: arr){
    if(digit<min)
        min=digit;
        if (digit > max)
            max = digit;


}
        System.out.println("largest :" + max);
        System.out.println("Smallest :" + min);

    }
}
