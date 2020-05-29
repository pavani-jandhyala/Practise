package Strings.Complex;

import java.util.Stack;

public class ValidateParanthesis {
    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    static boolean isBalanced(String s) {
        char[] ch = s.toCharArray();
        int l = s.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < l; i++) {
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
                stack.push(ch[i]);
            }

            if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(stack.pop(), ch[i])) {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            return true; /*balanced*/
        else
        {   /*not balanced*/
            return false;
        }

    }

    public static void main(String args[]) {
        String s = "{[()]}{";
        Boolean res = isBalanced(s);
        System.out.println(res);

    }
}
