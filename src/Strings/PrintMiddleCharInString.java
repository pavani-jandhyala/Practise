package Strings;

public class PrintMiddleCharInString {
    static String printMiddleChars(String s) {
        int l = s.length();
        int i=l/2;
        String middleChar="";
            if (l % 2 != 0) {
                Character c = s.charAt(i);
                middleChar = c.toString();
            }
            else {
                Character c2= s.charAt(i);
                Character c1 = s.charAt(i-1);
                middleChar = c1.toString() + c2.toString();
            }
        return middleChar;
    }

   public static void main(String args[]) {
        String s = printMiddleChars("jskfij");
        System.out.println(s);
    }
}
