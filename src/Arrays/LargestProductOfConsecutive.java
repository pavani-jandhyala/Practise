package Arrays;

public class LargestProductOfConsecutive {
    static int largeProductConsecutive(int[] a) {
        int max=1;
        int p=1;
        for (int i = 1; i < a.length-1; i++) {
            max=a[0]*a[1];
            p=a[i]*a[i+1];
            if(p>max){
                max=p;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {12, 3, 0, 1,15};
        int product = largeProductConsecutive(a);
        System.out.println(product);
    }
}
