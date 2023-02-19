package Recursion;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,23,25,30,34,40};
        int target = 29;
        System.out.println(ceiling(arr,target));
    }

    private static int ceiling(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            } else {
                return  mid;
            }
        }
        return start;
    }
}
