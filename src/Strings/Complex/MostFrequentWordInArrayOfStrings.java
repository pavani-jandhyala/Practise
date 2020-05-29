package Strings.Complex;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class MostFrequentWordInArrayOfStrings {
    public static String countMaxOccurance(String[] a){
        String s="";
        int max=0;
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        for(int i=0;i<a.length;i++){
            if(hm.get(a[i])>max){
                max=hm.get(a[i]);
            }
        }

        for(Map.Entry m : hm.entrySet()){
            if(m.getValue().equals(max)){
                s=(String)m.getKey();
                break;
            }
        }
        return s;
    }
    public static void main(String args[]){
        String str[] = {"test","test","test","num","num","num","count"};
        String res = countMaxOccurance(str);

        System.out.println(res);
    }
}
