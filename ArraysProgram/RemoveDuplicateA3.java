package Package1.ArraysProgram;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateA3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 88, 4, 5, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(arr[i], count);

        }
        for (Integer num : map.keySet()) {
            System.out.print(num+ " ");
        }
    }
}