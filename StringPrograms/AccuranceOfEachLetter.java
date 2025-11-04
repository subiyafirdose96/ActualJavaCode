package Package1.StringPrograms;

public class AccuranceOfEachLetter {
    public static void main(String[] args) {
        String word= "Java";
        word = word.replaceAll(" ", "").toLowerCase(); // Remove spaces and make lowercase

        String checked ="";// used to remove repetitive check of char

        for(int i=0;i<word.length();i++){

            char ch=word.charAt(i);
            if (checked.indexOf(ch) == -1) { // Process only if not already counted

            int count=0;
            for(int j=0;j<word.length();j++){
                if(ch==word.charAt(j)){
                    count++;
                }

            }
                System.out.println(ch + " "   + count);
            checked= checked+ch;

        }
    }
}}
