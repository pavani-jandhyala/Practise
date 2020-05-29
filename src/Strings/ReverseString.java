package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {

    static void reverseString(String s) {

        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }

    static String reverseStringWOSpecChars(String s){
        String rev="";
        Pattern regex = Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!{}]");
        Matcher matcher = regex.matcher(s);
        for(int i = s.length()-1;i>=0;i--){
            if(!matcher.find(i)){
                rev=rev+s.charAt(i);
            }
        }
        return rev;
    }

    public static void main(String[] args){
        String s = "H((ell$$oWorld";
        reverseString(s);
        String rev = reverseStringWOSpecChars(s);
        System.out.println(rev);
    }
}
