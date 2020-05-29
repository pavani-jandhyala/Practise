package Arrays;

public class ArrayRotation {

    static int[] leftRotation(int[] a, int d) {

        int temp[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        for (int i = 0; i < a.length - d; i++) {
            a[i] = temp[d + i];
            System.out.println(a[i]);

        }
        int j = 0;
        for (int i = d; i < a.length-1; i++) {
            a[i] = temp[j];
            j++;
            System.out.println(a[i]);
        }

        return a;

    }

    //easy way to leftRotate

    static int[] leftRotationEasy(int[] a, int d) {
        int n = a.length;
        int mod = d % n;
        int temp[]=new int[n];
        for(int i=0;i<a.length;i++){
            temp[i]=a[(mod+i)%n];
            System.out.println(temp[i]);
        }
        return a;

    }


    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        //int a[] = {33, 47, 70 ,37, 8 ,53 ,13 ,93, 71 ,72 ,51, 100, 60, 87, 97};
        int d = 2;
        leftRotationEasy(a,d);
        //leftRotation(a,d);
    }
}
