package Package1.StringPrograms;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s= "asnhieouwmlkjh";
        int vowels =0;
             int consonants =0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
//            "aeiou" is a string containing all lowercase vowels.
//             .indexOf(ch) returns:
//            The index of ch in the string if it exists (0–4)
            if ("aeiou".indexOf(ch) != -1) {
vowels++;
            }
            else{
                consonants++;
            }}
            System.out.println("vowels= "+vowels);
            System.out.println("consonants="+ consonants);


    }
}
