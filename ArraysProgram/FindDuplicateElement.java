package Package1.ArraysProgram;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr={2, 3, 2, 4, 3};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate "+ arr[i]);
                }
            }}}
}
