package Package1;

import java.util.Arrays;

public class TwoStringsAnagrams {
    public static void main(String[] args) {
        String s1="Listen";
        String s2="Silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] arr=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if( Arrays.equals(arr, arr2)){
            System.out.println("Anagrams");

        }else{
            System.out.println("Not Anagrams");
        }


    }
}
