package Arrays;

public class FindOrder {

    public static int[] sorting(int[] a, String order) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (order.equals("asc")) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                } else if (order.equals("desc")) {
                    if (a[i] < a[j]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        return a;
    }

        public static void main (String args[]){
            int a[] = {2, 4, 5, 7, 1};

            int[] b=sorting(a, "desc");
        /*for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }*/
        }
    }
