package Package1.StringPrograms;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s="Java programming selenium";
        String S1=s.replaceAll("\\s", "");
        System.out.println(S1);
    }
}
