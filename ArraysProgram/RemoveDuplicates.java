package Package1.ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={2, 4, 3, 2,6,3};
        Set<Integer> set= new HashSet<>();
        for(int digit: arr){
            set.add(digit);
        }
        System.out.println(set);

    }
}
