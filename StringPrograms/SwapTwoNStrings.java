package Package1.StringPrograms;

public class SwapTwoNStrings {
    public static void main(String[] args) {


    String s1= "Hello";
    String s2= "worrrld";
     s1=s1+s2;
     int n=s1.length()-s2.length();
     s2=s1.substring(0,n );
     s1= s1.substring(n);
        System.out.println(s1);
        System.out.println(s2);

    }}
