package Strings;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondSentenceSubsetOfFirst {
    static void subsetOfFirst(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        int sum = 0;
        for (int i = 0; i < str2.length; i++) {
            if (hm.containsKey(str2[i])) {
                hm.put(str2[i], hm.get(str2[i]) + 1);
            } else {
                hm.put(str2[i], 1);
            }

        }
        for (int i = 0; i < str1.length; i++) {
            if (hm.containsKey(str1[i])) {
                hm.put(str1[i], hm.get(str1[i]) - 1);
            }
        }
        for (int value : hm.values()) {
            sum += value;

        }
        if (sum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


    public static void main(String[] args) {

        String s1 = "give me one grand today night";
        String s2 = "give extra grand today";
        subsetOfFirst(s1, s2);

    }
}
