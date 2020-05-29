package Strings;

public class StringSubstrings {
    public static void Substring(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            }
        }

    }

    public static void main(String[] args) {
        String s="abcd";
        Substring(s);
    }
}
