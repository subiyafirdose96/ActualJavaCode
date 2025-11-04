package Package1.StringPrograms;

public class ConvertYouToUppercase {
        public static void main(String[] args) {
            String input = "You are good person you should be proud of yourself";

            String[] arr = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : arr) {
                if (word.equalsIgnoreCase("you")) {
                    result.append("YOU");
                } else {
                    result.append(word);
                }
                result.append(" ");
            }

            System.out.println("Output: " + result.toString().trim());
        }
    }

















// }}



















        // ?

