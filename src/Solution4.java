public class Solution4 {
    static long repeatedString(String s, long n) {
        long num1 = 0;
        long num = 0;
        String substring = s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                num1++;
        }
        long rem = n % (s.length());
        long q = n / (s.length());
        num = (num1 * q);
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a')
                num++;
        }

        return num;
    }

    public static void main(String[] args) {

        String s = "a";
        long n = 1000000000;

        long result = repeatedString(s, n);
        System.out.println(result);
    }
}
