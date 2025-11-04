package Package1.StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_collection {
    public static void main(String[] args) {
        String s="java";
        //Set - It will not accept duplicate - jav
        //LinkedHashSet - Because insertion oder is maintained.
        Set<Character > set=new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        // Convert set to string
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
          result.append(ch);}
        System.out.println(result);
    }
}
