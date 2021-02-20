package arrays;

import java.util.Arrays;

public class ClosestTriplet {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3)
        {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int j, k, sum;
        for(int i  =0; i < nums.length - 2; i++)
        {
            j = i+1;
            k = nums.length - 1;
            while(j < k)
            {
                sum = nums[i]+nums[j]+nums[k];
                if(sum == target)
                {
                    res = sum;
                    break;
                }
                else if(Math.abs(sum-target) < Math.abs(res-target))
                {
                    res = sum;
                }
                if(sum > target)
                {
                    --k;
                }
                else
                {
                    ++j;
                }
            }
        }
        return res;
    }
}
