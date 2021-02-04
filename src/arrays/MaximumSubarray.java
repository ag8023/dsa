package src.arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray msa = new MaximumSubarray();
        int max = msa.maxSubArray(nums);
        System.out.println("The sum of the largest contiguous subarray is: " + max);
    }

    public int maxSubArray(int[] nums)
    {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];
        for(int i = 1; i<n; i++)
        {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
