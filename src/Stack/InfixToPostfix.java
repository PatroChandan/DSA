package Stack;

import java.util.Stack;

/**
 * Question: Infix To postfix
 * Input: "a-b/c - d*c"
 * Output: abc/-dc*-
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(InfixToPostFix("a-b/c-d*c"));
    }
    public static String InfixToPostFix(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else {
                int precedenceOfChar = getPrecedence(ch);
                while (!stack.isEmpty() && getPrecedence(stack.peek())>=precedenceOfChar){
                    char popChar = stack.pop();
                    sb.append(popChar);
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            char popChar = stack.pop();
            sb.append(popChar);
        }
        return sb.toString();
    }

    private static int getPrecedence(char ch) {
        if(ch=='-'||ch=='+'){
            return 1;
        } else if (ch == '*'||ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        }
        return 0;
    }


}
