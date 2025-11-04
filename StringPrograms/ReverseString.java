package Package1.StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse String
        String s1= "Jav-a";
        //System.out.println(s1.split("_"));
        String s2="";
        int n=s1.length();
        for (int i=n-1; i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        //System.out.println(s2.substring(1));

    }
}
