import Arrays.FindOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class test extends FindOrder {
    public void example() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("name", "pavani");
        hm.put("name", "test");
        String str = "pavani";
        String str1 = new String("pavani");

    }

    public static void largestPalindromicString(String str) {
        int count = 0;
        String s = "";
        HashSet<String> a = new HashSet<>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    s = str.substring(i, j + 1);

                    for (int k = s.length() - 1; k > 0; k--) {
                        if (str.charAt(i) == s.charAt(k)) {
                            a.add(s);
                        }
                    }
                }
            }
        }
        int length = a.size();
        int b[] = new int[length];
        for (String k : a) {
            for (int i = 0; i < b.length; i++) {
                b[i] = k.length();
            }
        }
        int c[] = FindOrder.sorting(b, "desc");
        for (String r : a) {
            if (r.length() == c[0]) {
                System.out.println(r);
            }
        }

    }

    //“forgeeksskeegfor” -> “geeksskeeg”

    public static void main(String args[]) {
        //largestPalindromicString("forgeeksskeegfor");

        String s ="test";
        String s1="test";

        String s2=new String("test");

        if(s1==s2) {
            System.out.println(true);
        }


       if( s1.equals(s2)){
           System.out.println(true);
       }

        String s3=s2;
       if(s3==s2){
           System.out.println(true);
       }

        String s4=new String("test");
       if(s4==s2){
           System.out.println(true);
       }


    }
}
