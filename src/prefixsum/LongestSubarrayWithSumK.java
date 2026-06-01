package prefixsum;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        int result = longestSubarray(arr, k);
        System.out.println(result);
    }

    public static int longestSubarray(int[] arr, int k) {
        int length = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while (right < arr.length) {
            while (left<=right && sum > k) {
                sum-=arr[left];
                left++;
            }
            if(sum==k) {
                length = Math.max(length,right-left+1);
            }
            right++;
            if(right<arr.length) {
                sum+=arr[right];
            }
        }
        return length;
    }
}
