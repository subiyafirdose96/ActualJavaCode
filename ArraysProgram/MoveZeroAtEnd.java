package Package1.ArraysProgram;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {

                int[] arr = {1, 2, 0, 3, 5, 0, 4, 0, 0};
                int[] arr2 = new int[arr.length]; // initialized with zeros by default
        System.out.print(Arrays.toString(arr2));
                int index = 0; // pointer for arr2

                // Copy all non-zero elements to arr2
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        arr2[index++] = arr[i];
                    }
                }

                // arr2 now contains all non-zeros in front, zeros at the end
                System.out.println(Arrays.toString(arr2));
            }
        }



