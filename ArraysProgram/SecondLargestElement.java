package Package1.ArraysProgram;

import java.util.Arrays;



    public class SecondLargestElement {
        public static void main(String[] args) {
            int[] arr = {40, 52, 31, 100, 200, 81, 52, 99, 11, 81, 27, 99};

            // Assume first two values are max1 and max2 appropriately
            int max1=0, max2=0;
//            if (arr[0] > arr[1]) {
//                max1 = arr[0];
//                max2 = arr[1];
//            } else {
//                max1 = arr[1];
//                max2 = arr[0];
//            }

            // Start from index 2
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2 && arr[i] != max1) {
                    max2 = arr[i];
                }
            }

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Second largest element: " + max2);
            System.out.println("Largest element: " + max1);

        }
    }
