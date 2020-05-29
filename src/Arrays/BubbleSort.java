package Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] a){
        int l = a.length;
        int temp;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }

   public static void main(String args[]){
        int a[]={100,23,90,10,67,1};
        int a1[]=bubbleSort(a);
        for(int i=0;i<a1.length;i++) {
            System.out.println(a1[i]);
        }
    }
}
