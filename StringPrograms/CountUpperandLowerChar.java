package Package1.StringPrograms;

public class CountUpperandLowerChar {
    public static void main(String[] args) {
        String s="Welcome TOo automation";
        int upper=0;
        int lower=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                lower++;
            }
        else {
            upper++;
            }}
            System.out.println(lower);
        System.out.println(upper);


    }
}
