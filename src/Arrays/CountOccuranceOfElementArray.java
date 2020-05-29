package Arrays;

public class CountOccuranceOfElementArray {

    static int occurance(int[] a,int n){
        int count =0;
        for(int i =0;i<a.length;i++){
            if(a[i]==n)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 1, 4, 5,6,8};
        int n = occurance(a,1);
        System.out.println(n);

    }

}
