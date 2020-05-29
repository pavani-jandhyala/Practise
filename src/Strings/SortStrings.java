package Strings;

public class SortStrings {
    public static void main(String args[]){
        String[] words={"Peach", "Orange", "Mango", "Cherry", "Apple"};
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].compareTo(words[j])>0){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("Lexographical order of words is:");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
