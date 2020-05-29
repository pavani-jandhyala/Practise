package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicateElementArray {
    static int maxRepeatingElementArray(int[] a) {
        int ele=0;
        int max=a[0];
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
            max=Math.max(max,hm.get(a[i]));
        }
        for(int i =0;i<a.length;i++){
            if(hm.get(a[i])==max){
                ele=a[i];
            }
        }
        return ele;

    }

    static int firstRepeatingElementArray(int a[]){
        int n=0;
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for(int i =0;i<a.length;i++){
                if(hm.get(a[i])>1){
                    n=a[i];
                    break;
                }
            }
        return n;

        /*int min = -1;

        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array from right to left
        for (int i=a.length-1; i>=0; i--)
        {
            // If element is already in hash set, update min
            if (set.contains(a[i]))
                min = i;

            else   // Else add element to hash set
                set.add(a[i]);
        }

        if (min != -1)
            System.out.println("The first repeating element is " + a[min]);
        else
            System.out.println("There are no repeating elements");*/
    }

    static int firstNonRepeatingElementArray(int a[]){
        int n=0;
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
            for (int i = 0; i < a.length; i++) {
                if (hm.containsKey(a[i])) {
                    hm.put(a[i], hm.get(a[i]) + 1);
                } else {
                    hm.put(a[i], 1);
                }
            }
        for(int i =0;i<a.length;i++){
            if(hm.get(a[i])==1){
                n=a[i];
                break;
            }
        }
        return n;

    }
        public static void main (String[] args){

            int a[] = {1, 1, 8, 2, 5, 5, 3, 5};
            int res = maxRepeatingElementArray(a);
            System.out.println(res);
            int res1 = firstRepeatingElementArray(a);
            System.out.println(res1);
            int res2 = firstNonRepeatingElementArray(a);
            System.out.println(res2);

        }
    }

