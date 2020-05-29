import java.util.Scanner;
public class HackerEarth1 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
            int nT = s.nextInt();
            int res=0;
            while(nT>0){
                int n = s.nextInt();
                int k = s.nextInt();
                int a[]=new int[n];
                int min = s.nextInt();
                for(int i=1;i<n;i++){
                    a[i]=s.nextInt();
                    if(min>a[i]){

                        min=a[i];
                    }
                }
                res=k-min;
                if(res<0){
                    res = 0;
                }
                System.out.println(res);
                nT--;
            }
        }
}
