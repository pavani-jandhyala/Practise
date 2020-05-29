import java.util.Scanner;

class HackerEarth2 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int nT = Integer.parseInt(s.nextLine());
        while(nT>0){
            int n = Integer.parseInt(s.nextLine());
            String str = s.nextLine();
            char[] ch = str.toCharArray();
            for(int i=0;i<n;i++){
                if(ch[i] == 'A'){
                   ch[i] = 'T';
                   continue;
                }
                else if(ch[i] == 'T'){
                    ch[i] = 'A';
                    continue;
                }
                else if(ch[i] == 'G'){
                    ch[i] = 'C';
                    continue;
                }
                else if(ch[i] == 'C'){
                    ch[i] = 'G';
                    continue;
                }
                else{
                    System.out.println("Error RNA nucleobases found!");
                    break;
                }

            }
            System.out.println(ch);
            nT--;
        }



    }
    }