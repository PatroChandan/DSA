package Stack;

import java.util.Stack;

/**
 * Question: Min Operations to Balance the Brackets.
 * Input: "}}{{}}{{"
 * Output: 2
 */
public class MinNoOfOperationBalance {
    public static void main(String[] args) {
        int minimumOperationAns = minNoOfBalance("}{{{");
        System.out.println(minimumOperationAns);
    }
    public static int minNoOfBalance(String str){
        if(str.length()%2!=0){
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(checkIfOpeningBracket(ch)){
                stack.push(ch);
            } else if (!checkIfOpeningBracket(ch) && !stack.isEmpty() && checkIfOpeningBracket(stack.peek())){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        int openbracketcount = 0;
        int closingbracketCount = 0;
        while(!stack.isEmpty()){
            char popChar = stack.pop();
            if(checkIfOpeningBracket(popChar)){
                openbracketcount++;
            }else {
                closingbracketCount++;
            }
        }
        //CASE-1 (when opening and closing bracket are divisible by 2)
        //CASE-2 (when opening and closing brackets are not divisible by 2)
        if(openbracketcount%2==0 && closingbracketCount%2==0){
            return (openbracketcount+closingbracketCount)/2;
        }else {
            return (openbracketcount+closingbracketCount+2)/2;
        }
    }

    private static boolean checkIfOpeningBracket(char ch) {

        return (ch == '{'||ch == '('||ch=='[')?true:false;
    }
}
