package Package1.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountEachVowelsSeparately_collection {
    public static void main(String[] args) {
        String s="yoau love Yiou mie";
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length();i++){
            int count=0;

            for(int j=0; j<s.length();j++){
                if (s.charAt(i)== s.charAt(j)){
                    count++;

                }
            }
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
                map.put(s.charAt(i), count);
            }
        }
        System.out.println(map);
    }
}

