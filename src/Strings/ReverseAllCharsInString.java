package Strings;

public class ReverseAllCharsInString {
    static void reverseAllCharsInString(String s) {

        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        String s = "I love Java Programming";
        reverseAllCharsInString(s);
    }
}
