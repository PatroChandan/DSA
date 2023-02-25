package Stack;

import java.util.Stack;

public class InfixToPreFix {
    public static void main(String[] args) {
        System.out.println(Infix2PreFix("a-b/c-d*c"));
    }

    private static String Infix2PreFix(String str) {
//        String st = "";
        for (int i = str.length()-1; i < 0; i--) {
            str = str.charAt(i)+str;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >='a'&& ch<='z'){
                sb.append(ch);
            }else {
                int precedenceOfChar = getPrecedence(ch);
                while (!stack.isEmpty() && (getPrecedence(stack.peek())>=precedenceOfChar && ch =='^')
                        || !stack.isEmpty() && (getPrecedence(stack.peek())>precedenceOfChar)){
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
        for (int i = sb.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static int getPrecedence(char ch) {
        if(ch == '-'||ch=='+'){
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        }
        return 0;
    }
}
