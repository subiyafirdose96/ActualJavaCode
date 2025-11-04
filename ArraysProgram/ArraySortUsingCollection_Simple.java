package Package1.ArraysProgram;

import java.util.Set;
import java.util.TreeSet;

public class ArraySortUsingCollection_Simple {
    public static void main(String[] args) {
        int [] arr={12, 30, -20, 5, 15};
        Set<Integer> set=new TreeSet<>();
        for(int digit:arr){
            set.add(digit);
        }
        System.out.println(set);


    }
}
