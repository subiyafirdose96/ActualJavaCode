package Package1.StringPrograms;

public class ReverseEachwordInString {
    public static void main(String[] args) {
                String word = "java program";
                String[] arr = word.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    String temp = "";
                    for (int j = arr[i].length() - 1; j >= 0; j--) //length() bcs you are using stri;program≥ng in j for loop
                    {
                        temp = temp + arr[i].charAt(j);
                    }
                    System.out.print(temp+" ");
                }
            }
        }


