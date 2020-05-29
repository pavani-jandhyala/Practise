package Arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatingMissingNo {

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;

        Map<Integer, Boolean> numberMap = new HashMap<>();

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                System.out.println("Repeating = " + i);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }
    }
}
