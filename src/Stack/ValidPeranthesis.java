package Stack;

import java.util.Stack;

/**
 * Question: Valid Peranthesis
 * Input: [({)}]
 * Output: false
 *
 * Input: [(){}]
 * Output: true
 */
public class ValidPeranthesis {
    public static void main(String[] args) {
        String ValidParenthesis = "[](){([]{[}[]])}";
        Boolean validParenthesisAns = isParentasisValid(ValidParenthesis);
        System.out.println(validParenthesisAns + " is valid parenthesis");
    }
    public static boolean isParentasisValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('||ch == '{'||ch == '['){
                //this is for opening bracket
                stack.push(ch);
            }else {
                //this is for closing bracket
                char pair = getPair(ch);
                if (stack.isEmpty()){
                    return  false;
                }
                char topOfTheStack = stack.peek();
                if(topOfTheStack == pair){
                    stack.pop();
                }else {
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static char getPair(char ch) {
        char pair = ')';
        if(ch == ')'){
            pair = '(';
        } else if (ch == ']') {
            pair = '[';
        } else if (ch == '}') {
            pair = '{';
        }
        return pair;
    }

}
