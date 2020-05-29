package Arrays;

public class MissingNoInArray {
    static int missingNo(int[] a){
        int n=a.length;
        int sum =0;
        sum = (n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            sum = sum-a[i];
        }

        return sum;
    }
    public static void main(String args[]){
        int a[]={1,2,3,5};
        //if array is not sorted
       int n = missingNo(a);
        System.out.println(n);
        //array is sorted

        /*for(int i=0;i<a.length-1;i++){
            if(a[i]+1!=a[i+1]){
                System.out.println("Missing no is" + (a[i]+1));
            }
        }*/
    }
}
