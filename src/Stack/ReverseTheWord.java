package Stack;

import java.util.Stack;

/**
 * Question: Reverse the word.
 * Input: "america"
 * output: "acirema"
 */
public class ReverseTheWord {
    public static void main(String[] args) {
        String reverseWordString = "america";
        String reverseWordAns = reverseWord(reverseWordString);
        System.out.println(reverseWordAns);
    }
    public static String reverseWord(String word){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            //@here pushing every element into stack
            char ch = word.charAt(i);
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            //@here which ever element poping that storing in string builder
            char popVal = stack.pop();
            sb.append(popVal);
        }
        return sb.toString();
    }
}
