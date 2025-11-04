package Package1.StringPrograms;

public class ConvertFirstCharToUppercaseINSentence {
    public static void main(String[] args) {
        String sentence = "i am an automation tester";
        String[] arr=sentence.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : arr) {
           // if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))  // First letter
                        .append(word.substring(1))              // Rest of the word
                        .append(" ");



        }
        System.out.println(capitalized);
    }
}
