package Strings.Complex;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramSubstring {
     public static int countAnagramSubstring(String s) {

        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }
        return anagramPairCount;
    }

    public static void main(String[] args){
         int count = countAnagramSubstring("abba");
         System.out.println(count);
    }

}


