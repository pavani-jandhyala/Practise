package Strings;

public class RemoveSpecificElement {
    public static String removeChar(String input){
        char[] ch = input.toCharArray();
        int count=0;
        String s="";
        for(int i=0;i<ch.length;i++){
           if(ch[i]!='a' || count==0){
               s=s+ch[i];
           }
           if(ch[i]=='a'){
               count++;
           }
        }

        return s;

    }
    public static void main(String args[]) {
        String input = "Sarthakaakjaaakjaaaaaa";
        String output = removeChar(input);
        System.out.println(output);
        //Ouput = Sarthkkjkj
    }
}
