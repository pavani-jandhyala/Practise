package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccuranceOfCharString {

    static void occurance(String s){
        int count =0;
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        char[] ch = s.toCharArray();
        for(Character c:ch){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }

        }

        for(Map.Entry m : hm.entrySet()){
           System.out.println( m.getKey() + " "+ m.getValue());
        }
    }

    public static void main(String[] args) {

        String s="Hello";
        occurance(s);

    }

}
