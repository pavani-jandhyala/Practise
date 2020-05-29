package Arrays;

public class MinSwapsForSortArray {

    static int minimumSwaps(int[] arr) {
        boolean visited[]=new boolean[arr.length];
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int j=i,cycle=0;

            while(!visited[j]){
                visited[j]=true;
                if(arr[j]!=0){
                    j=arr[j]-1;
                }else{
                    j=0;
                }
                cycle++;
            }

            if(cycle!=0)
                swap+=cycle-1;
        }

            return swap;
    }


    public static void main(String args[]){
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        int n = minimumSwaps(arr);
        System.out.println(n);
    }
}
