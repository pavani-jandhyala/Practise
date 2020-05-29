public class Solution3 {

    static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        int i=0;
        while(i <c.length-1){
            if(c[i+2]==1){
                i=i+1;
            }
            else  {
                i=i+2;
            }

            minJumps++;
            if ( i == c.length-1){
                break;
            }
                else if ( i+2 > c.length -1 ){
                   minJumps++;
                    break;
                }

            }

        return minJumps;

    }

    public static void main(String[] args) {
        int[] c1 = {0, 0, 0, 0, 1, 0};
        int[] c = {0, 0, 0, 1, 0,0};

        int result = jumpingOnClouds(c);
        System.out.println(result);
    }
}
