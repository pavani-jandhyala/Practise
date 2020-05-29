package Strings.Complex;

public class LexographicallySmallestString {

    static String smallest(String s) {
        int l = s.length();
        String ans = "";
        for (int i = 0; i < l - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                //append the String without i-th character in it
                for(int j=0;j<l;j++){
                    if(i!=j){
                        ans = ans+ s.charAt(j);
                    }
                }
                return ans;
            }
        }
        // leave the last character
        ans = s.substring(0, l - 1);
        return ans;

    }
    public static void main(String[] args) {

        String s = "abcda";
        System.out.println(smallest(s));
    }
}

