package Array;

public class TrappingRainWater42 {
    public static void main(String[] args) {

        /**
         * Given n non-negative integers representing an elevation map where the width of each bar is 1,
         * compute how much water it can trap after raining.
         */
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapWater(arr));
    }

    private static int trapWater(int[] arr) {
        int n = arr.length;
        int water = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-arr[i];
        }
        return water;
    }
}