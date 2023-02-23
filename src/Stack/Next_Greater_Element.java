package Stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Question: Next Greater Element
 * Input: 1 2 7 6 25 13 12 19 10.
 * Output: 2 7 25 25 -1 19 19 -1 -1
 */
public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] nextGreaterElementArr = new int[]{1, 2, 7, 6, 25, 13, 12, 19, 10};
        int[] ansNext = nextGreaterElement(nextGreaterElementArr);
//        System.out.println(ansNextGreaterElementArr+""+ "Next greatest element");
        for (int i = 0; i < ansNext.length; i++) {
            System.out.print(ansNext[i]+" ");
        }
    }
    public static int[] nextGreaterElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1;i<arr.length;i++){
            int item = arr[i];
            //checking next greater element
            while(!stack.isEmpty() && (arr[stack.peek()]<item)){
                int popIndex = stack.pop();
                //if found greater element than will store in map as per the index
                map.put(popIndex,item);
            }
            stack.push(i);
        }
        //if stack is not empty than again we will check if
        // greater element not there than will add -1;
        while (!stack.isEmpty()){
            int popIndex = stack.pop();
            map.put(popIndex,-1);
        }
        int [] ansArr = new int[arr.length];
        for (int i = 0; i < ansArr.length; i++) {
            ansArr[i] = map.get(i);
        }
        return ansArr;
    }
}
