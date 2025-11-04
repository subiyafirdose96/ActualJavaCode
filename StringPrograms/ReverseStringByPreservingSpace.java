package Package1.StringPrograms;

public class ReverseStringByPreservingSpace {
    public static void main(String[] args) {
        String s = "welcome to automation";
        char[] arr = s.toCharArray();
        System.out.println(arr);
        char[] result = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = arr[i];
                j--;
            }}
            System.out.println(String.valueOf(result));

    }}