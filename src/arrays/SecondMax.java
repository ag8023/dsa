package src.arrays;

public class SecondMax {
    public int SecondMaxValue(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Keep track of maximum value; whenever the value at array is greater than the current max value
        // make current max value as second max and value at array as max

        for(int i = 0; i<n; i++)
        {
            if(nums[i] > max)
            {
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] > secondMax && nums[i]!=max)
            {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
}
