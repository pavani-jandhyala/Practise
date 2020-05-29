package Arrays;

public class ReverseSubsetArray {

    static int[] sortArray(int[] arr){
        int l = arr.length;
        int temp;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    static int[] sortSubsetArray(int[] a, int n) {
        int l = a.length;
        int[] b = new int[n];
        int i = 0;
        while (i < l-n) {
            for(int j=0;j<b.length;j++){
                b[j]=a[i+j];
            }
            b=sortArray(b);
            for(int k=0;k<n;k++){
                a[i+k]=b[k];
            }
            i = i + n;
        }
        return a;

    }

    static void reverseSusbsetArray(int a[], int k){
        int n = a.length;
        for(int i=0;i<n;i++){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            int temp;
            while(left<right){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left+=1;
                right-=1;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int a[] = sortSubsetArray(arr,3);
        reverseSusbsetArray(arr,4);
    }
}


