import java.util.HashMap;

public class CodilityTest {
    static int solution(String s) {
        char ch[] = s.toCharArray();
        boolean b = true;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int n = 0;
        for (Character c : ch) {
            if (Character.isLowerCase(c)) {
                if (hm1.containsKey(c)) {
                    hm1.put(c, hm1.get(c) + 1);
                } else {
                    hm1.put(c, 1);
                }

            } else {
                if (hm2.containsKey(c)) {
                    hm2.put(c, hm2.get(c) + 1);
                } else {
                    hm2.put(c, 1);
                }
            }
        }
        int l=1,max=1;
        for (Character c : ch) {
            Character c1=Character.toUpperCase(c);
            Character c2=Character.toLowerCase(c);
            if(Character.isLowerCase(c) && hm2.containsKey(c1)){
                max++;
            }
            else if(Character.isUpperCase(c) && hm1.containsKey(c2)){
                max++;
            }
            else {
                if(l>max){
                    max=l;
                }
                l=0;
            }

            max=Math.max(l,max);
        }
        if(max==1) {
            return -1;
        }
        return max;
    }
        public static void main (String args[]){
            int k = solution("TAocCat");
            System.out.println(k);


        }
    }
