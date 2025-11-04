package Package1.ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsTwoArr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }for(int j:b){
            if(set.contains(j)){
                System.out.println(j);
            }
        }
    }
}
