package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonCharInString {

    static String commonChar(String s1, String s2) {

        int count = 0;
        String res = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            hm.put(ch1[i], 0);
        }

        for (int i = 0; i < ch2.length; i++) {
            if (hm.containsKey(ch2[i])) {
                count++;
            }
        }
        if (count > 0)
            res = "YES";
        else
            res = "NO";
        return res;
    }

    static void printCommon(String s1, String s2) {
        String res1 = "";
        String res = "";
        HashMap<Integer, Character> hm = new HashMap<>();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            hm.put(i, ch1[i]);
        }

        for (int i = 0; i < ch2.length; i++) {
            Set<Character> set = new HashSet<>();
            if (hm.containsValue(ch2[i])) {
                set.add(ch2[i]);
                for (Character ch : set) {
                    System.out.println(ch);
                }
            }
        }
    }


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        //String result = commonChar(s1, s2);
       // System.out.println(result);
        printCommon(s1, s2);

    }
}
