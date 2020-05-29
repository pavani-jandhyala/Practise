package Strings;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {
    static int makeAnagram(String a, String b) {

        //Remove n letters to make two strings common/anagram of each other
        int sum=0;
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if (hm1.containsKey(ch1[i])) {
                hm1.put(ch1[i], hm1.get(ch1[i]) + 1);
            } else {
                hm1.put(ch1[i], 1);
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i=0;i<b.length();i++){
            if (hm1.containsKey(ch2[i])) {
                hm1.put(ch2[i], hm1.get(ch2[i]) - 1);
            } else if(hm2.containsKey(ch2[i])) {
                hm2.put(ch2[i], hm2.get(ch2[i]) + 1);
            }
            else{
                hm2.put(ch2[i],1);
            }
        }

        for (int value : hm1.values()) {
            sum += Math.abs(value);
        }

        for (int value : hm2.values()) {
            sum += Math.abs(value);
        }
        return sum;
    }
    static boolean isAnagram(char[] c1,char[] c2){
        Arrays.sort(c1);
        Arrays.sort(c2);
        int n1=c1.length;
        int n2=c2.length;
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++)
            if(c1[i]!=c2[i])
                return false;
        return true;

    }
    public static void main(String[] args){
        String s1= "LISTEN";
        String s2= "SILENT";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        //int c = makeAnagram(s1,s2);
        //System.out.println(c);
        Boolean b = isAnagram(ch1,ch2);
        System.out.println(b);
        //Sort two strings, and check both are equal or not or use hashmap and hm1.equals(hm2)
    }
}
