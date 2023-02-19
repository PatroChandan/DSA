package Array;


/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(arr));
    }

    private static int mostWater(int[] arr) {
        int i =0;
        int j = arr.length-1;
        int result = 0;
        int max = Integer.MIN_VALUE;
        while (i<j){
            if(arr[i]<arr[j]){
                result = arr[i]*Math.abs(i-j);
                max = Math.max(max,result);
                i++;
            }else{
                result = arr[j]*Math.abs(i-j);
                max = Math.max(max,result);
                j--;
            }
        }
        return max;
    }
}
