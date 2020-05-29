package Arrays;

public class CheckArrayElementsConsecutive {
    static boolean checkConsecutiveArray(int[] a) {
        int n = a.length;
        int min = a[0];
        int max = a[0];
        //max and min element in array
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        if((max-min) == n -1){
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 0, 4,1};
        boolean res = checkConsecutiveArray(a);
        System.out.println(res);
    }
}
