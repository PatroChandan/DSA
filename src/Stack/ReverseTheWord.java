package Stack;

import java.util.Stack;

public class ReverseTheWord {
    public static void main(String[] args) {
        String reverseWordString = "america";
        String reverseWordAns = reverseWord(reverseWordString);
        System.out.println(reverseWordAns);
    }
    public static String reverseWord(String word){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            char popVal = stack.pop();
            sb.append(popVal);
        }
        return sb.toString();
    }
}
