package Package1.StringPrograms;

import java.util.*;

public class AccuranceOfEachChar_collection {

        public static void main(String[] args) {
            String s="java";
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                int count=0;
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                    }
                }
                map.put(s.charAt(i), count);
            }
            System.out.println(map);
        }
        }


