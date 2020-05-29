public class Fibonacci {
    static void fibonacciSeries(int count){

        int n1=0,n2=1,n3=0;
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

    /*static int nthFibonacciNum(int n){

    }*/
    public static void main(String args[]){
        fibonacciSeries(10);
        //nthFibonacciNum()

    }

}
