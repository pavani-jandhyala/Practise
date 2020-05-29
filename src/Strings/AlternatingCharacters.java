package Strings;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                sum=sum+1;
            }
        }
        return sum;

    }


    public static void main(String[] args)  {
        String s= "AAABABAB";
        int n = alternatingCharacters(s);
        System.out.println(n);
    }
}
