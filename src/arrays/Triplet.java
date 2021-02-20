package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length - 1, j, k, sum;
        for(int i = 0; i < len - 1; i++)
        {
            if(i> 0  && nums[i-1] == nums[i])
                continue;
            j = i+1;
            k = len;
            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    ++j;
                    --k;
                    //to avoid duplicate values for j and k
                    while(j<k && nums[j-1] == nums[j])++j;
                    while(j<k && nums[k] == nums[k+1])--k;
                }
                else if(sum < 0)
                {
                    ++j;
                }
                else
                {
                    --k;
                }
            }

        }        return res;
    }
}
