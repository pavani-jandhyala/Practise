package Strings;

public class RotateString {

    static String leftrotate(String s,int d){
        String ans = s.substring(d)+s.substring(0,d);
        return ans;
    }

    static String rightrotate(String s,int d){

        return leftrotate(s,s.length()-d);
    }

    public static void main(String args[])
    {
        String str1 = "GeeksforGeeks";
        System.out.println(leftrotate(str1, 2));
        System.out.println(rightrotate(str1, 2));
    }

}
