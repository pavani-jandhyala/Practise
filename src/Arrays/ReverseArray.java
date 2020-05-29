package Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] a) {

        int ar[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            int j=(a.length-1)-i;
            ar[j]=a[i];
        }

        return ar;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 3, 2};
        int[] res = reverseArray(arr);
    }
}
