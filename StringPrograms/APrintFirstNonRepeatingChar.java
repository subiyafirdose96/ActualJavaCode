package Package1.StringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class APrintFirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="swiss";
        //use linkedHashmap to preserve order
        Map<Character, Integer> map= new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            int count=0;
            for(int j=0; j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            map.put(s.charAt(i), count);
        }
        System.out.println(map);

        for(Character ch:map.keySet()){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;//otherwise all value 1 characters will get printed
            }
        }
    }
}
