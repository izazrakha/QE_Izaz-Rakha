public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = findMaxSubarraySum(nums1, k1);
        System.out.println("Maximum subarray sum: " + maxSum1);

        int[] nums2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = findMaxSubarraySum(nums2, k2);
        System.out.println("Maximum subarray sum: " + maxSum2);
    }
    public static int findMaxSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
