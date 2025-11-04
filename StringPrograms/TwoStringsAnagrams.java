package Package1.StringPrograms;

import Package1.BankAccount;

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

    public static class BankAccount_main {
        public static void main(String[] args) {
            BankAccount ba= new BankAccount(12345, "Suba", 23000);
            ba.withdrawAmmount(1000);
            ba.depositAmmount(800);
        }
    }
}
