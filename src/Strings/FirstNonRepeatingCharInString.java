package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {
    static void firstNonRepeatinChar(String s){
        int count =0;
        HashMap<Character,Integer> hm=new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(hm.containsKey(ch[i])){
                hm.put(ch[i],hm.get(ch[i])+1);
            }
            else{
                hm.put(ch[i],1);
            }
        }

        for(Map.Entry m : hm.entrySet()){
            if(m.getValue().equals(1)) {
                System.out.println(m.getKey() + " " + m.getValue());
                break;
            }
        }
    }

    public static void main(String[] args) {

        String s="is it your first company";
        firstNonRepeatinChar(s);

    }
}
