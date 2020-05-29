import java.util.Scanner;

public class FlipBinaryNoToOddEven {

    static void convertBinaryToNo(String s) {
        String res = "";
        int n = Integer.parseInt(s, 2);
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else
            System.out.println("ODD");
    }

    static int[] flip(int[] a, int pos) {
        if (a[pos] == 0) {
            a[pos] = 1;
        } else {
            a[pos] = 0;
        }
        return a;
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        while (q > 0) {
            int r = s.nextInt();
            if (r == 1) {
                int k = s.nextInt();
                a = flip(a, k - 1);
            }
            if (r == 0) {
                int t = s.nextInt();
                int m = s.nextInt();
                String st = "";
                for (int i = t-1; i <= m-1; i++) {
                    st = st + a[i];
                }
                convertBinaryToNo(st);
            }
            q--;
        }
    }
}