package Arrays;

public class MoveAllZeroToEnd {

    static int[] zerosToEnd1(int[] a) {
        int count = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = 0;
        }
        int j=0;
            for(int i=0; i<a.length;i++){
                if(a[i]!=0){
                    b[j]=a[i];
                    j++;
                }
            }
            return b;

        }

    static int[] zerosToEnd(int[] a) {
        int count=0;
        int temp;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] != 0)) {
                temp = a[count];
                a[count] = a[i];
                a[i] = temp;
                count = count + 1;
            }
        }
        return a;

    }

        public static void main(String[] args) {

        int a[]={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        //int b1[] = zerosToEnd(a);
        int b[] = zerosToEnd1(a);
            for(int i=0;i<a.length;i++) {
                System.out.println(b[i]);
            }


    }
}
