package Strings.Complex;

public class StringCompression_RunLengthEncoding {
    //i: aaaabbbca
    //o:a4b3ca

    public static String charCount(String s){

        char[] ch = s.toCharArray();
        String s2="";
        int l = s.length();

        for(int i=0;i<l;i++) {
            int c = 1;
            while(i<l-1 && ch[i] == ch[i + 1]) {
                c++;
                i++;
            }
            if(c==1){
                s2=s2+ch[i];
            }
            else {
                s2=s2+ch[i]+c;
            }
        }


        return s2;
    }
    public static void main(String args[]){
        String s="aaaabbbca";
        String s1=charCount(s);
        System.out.println(s1);
    }
}
