package Package1.ArraysProgram;

public class SumOf2Elements {
    //Find all pairs in an array whose sum is equal to a given number.
    public static void main(String[] args) {

                int[] arr = {1, 5, 7, -1, 4, 2, 3, 5};
                int target = 6;

                System.out.println("Pairs with sum " + target + ":");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == target) {
                            System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                        }
                    }
                }
            }
        }


