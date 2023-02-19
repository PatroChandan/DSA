package Array;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays4 {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(median(arr1,arr2));
    }

    private static double median(int[] arr1, int[] arr2) {
        /**
         * first i have merger 2 arrays using merge sort so that both the arrays element will store in one place as sorted order
         * than check if array length is "odd" then median will be (array.length/2) if "even" then (array.length/2)+(array.length/2+1).
         */
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n2+n1];
        int m = n2+n1;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }else {
                ans[k++]=arr2[j++];
            }
        }
        while(i<n1){
            ans[k++] = arr1[i++];
        }
        while (j<n2){
            ans[k++] = arr2[j++];
        }
        double median = 0;
        if(ans.length%2!=0){
            median = (double) ans[ans.length/2];
        }else{
            median = (double) (ans[ans.length/2]+ans[ans.length/2+1]);
        }
        return median;
    }
}
