package Strings;

public class FirstOccuranceOfElementString {
    //char in string --> indexOf(char) , indexOf(string)
    public static void main(String args[]){
        String s = new String("Welcome to geeksforgeeks");
        System.out.println("First index of g is " + s.indexOf('g',1));
        System.out.println("Last index of g is " + s.lastIndexOf('g'));
    }
}
