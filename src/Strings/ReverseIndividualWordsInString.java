package Strings;

public class ReverseIndividualWordsInString {
    static void reverseIndividualWordsInString(String s) {

        String[] s1 = s.split(" ");
        String revWord = "";
        String revString = "";
        for(int i=0;i<s1.length;i++){
            String t = s1[i];
            for(int j=t.length()-1;j>=0;j--){
                revWord=revWord+t.charAt(j);
            }
            revWord = revWord + " ";
        }
        revString = revString + " " + revWord;

        System.out.println(revString);
    }
    public static void main(String[] args){
        String s = "Hello World Test";
        reverseIndividualWordsInString(s);
    }
}
