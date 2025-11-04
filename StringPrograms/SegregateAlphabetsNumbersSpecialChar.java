package Package1.StringPrograms;

import java.util.ArrayList;

public class SegregateAlphabetsNumbersSpecialChar {
    public static void main(String[] args) {
        String name="Sachin@#$$$$1234";
        ArrayList<Character> alphabets = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isAlphabetic(ch)){
                alphabets.add(ch);
            } else if (Character.isDigit(ch)) {
                digits.add(ch);
            }
            else{
                specialChars.add(ch);
            }}
        System.out.println(alphabets);
        System.out.println(digits);
        System.out.println(specialChars);

        }}
