public class SumOfDigitsOfNumber {
    static int sumOfDigitsOfNo(int n){
        int sum=0,rem=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        int n = 4354543;
        int sum = sumOfDigitsOfNo(n);
        System.out.println(sum);
    }
}
