public class Solution2 {
    static int countingValleys(int n, String s) {
        int v=0, m=0;
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                h = h - 1;
            }
            else {
                h = h + 1;
            }
            if(h == 0 && s.charAt(i) == 'U'){
                v=v+1;
            }
        }
        return v;


    }

    /*private static final Scanner scanner = new Scanner(System.in);*/

    public static void main(String[] args) {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();*/
        String s = "UDDDUDUU";


        int result = countingValleys(8, s);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
