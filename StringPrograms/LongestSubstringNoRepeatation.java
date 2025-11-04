package Package1.StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringNoRepeatation {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int start=0;
        int end=0;
        int maxLength =0;
        List<Character> list=new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength, list.size());
                System.out.println(list); //just to see all characters in list
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(maxLength);
    }
}
