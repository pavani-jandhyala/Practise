import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs;
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            if (ar1.contains(ar[i])) {
                continue;
            }
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            ar1.add(ar[i]);
            pairs = pairs+ (count / 2);
        }
        System.out.println(pairs);
        return pairs;


        /*Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(c[i])) {
                colors.add(c[i]);
            } else {
                pairs++;
                colors.remove(c[i]);
            }
        }*/

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }*/

        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        int result = sockMerchant(10, ar);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
