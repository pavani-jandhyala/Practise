package Arrays;

public class FirstOccuranceOfElementArray {

    //using binary search
    public static int first(int a[], int low, int high, int x, int n){
        if(high>=low) {
            int mid = low + (high - low) / 2;
            if (mid == 0 || x > a[mid - 1] && a[mid] == x) {
                return mid;
            } else if (x > a[mid]) {
                return first(a, mid + 1, high, x, n);
            } else {
                return first(a, low, mid - 1, x, n);
            }
        }
        return -1;
    }

    public static int last(int a[], int low, int high, int x, int n){
        if(high>=low) {
            int mid = low + (high - low) / 2;
            if (mid == n - 1 || x < a[mid + 1] && a[mid] == x) {
                return mid;
            } else if (x < a[mid]) {
                return last(a, low, mid - 1, x, n);
            } else {
                return last(a, mid + 1, high, x, n);
            }
        }
        return -1;
    }

    public static void main (String args[]){
        int a[]= {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n=a.length;
        int x=2;
        System.out.println("First Occurance of " + x +  " is " + first(a,0,n-1,x,n));
        System.out.println("Last Occurance of " + x +  " is " + last(a,0,n-1,x,n));
    }
}
