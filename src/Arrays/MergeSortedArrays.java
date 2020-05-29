package Arrays;

public class MergeSortedArrays {

    static int[] mergeSortedArrays(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else {
                c[k++]=b[j++];
            }
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }
        return c;

    }

    public static void main(String[] args) {
        int[] a = {2, 4, 8, 9};
        int[] b = {0, 1, 5};
        int c[] = mergeSortedArrays(a, b);
        System.out.println(c);
    }
}
