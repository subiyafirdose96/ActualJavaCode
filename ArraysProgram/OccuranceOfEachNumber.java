package Package1.ArraysProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachNumber {
    public static void main(String[] args) {
        int[] arr = {30, 20, 15, 20, 5, 20, 12, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            map.put(arr[i], count);
        }
        System.out.println(map);
    }
}