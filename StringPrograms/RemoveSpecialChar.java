package Package1.StringPrograms;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        //String s= "Java%^&*((prog)";
        String s="^&*()_)(*&^%$%^&*()(*&~{:Java%^&*(Program";
        //replace() - use to replace single char
        //String s1= s.replace("&", "0");

        //replaceAll() - Replaces each substring of this string that matches the given regular expression with the given replacement.
        //we don't know all special char and junk char to pass as parameter; that's why we use "^" infront of char&Num

        String s1=s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s1);
    }
}
