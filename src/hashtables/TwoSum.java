package src.hashtables;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int complement = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
           complement = target-nums[i];
           if(hmap.containsKey(complement))
           {
               return new int []{hmap.get(complement), i};
           }
           hmap.put(nums[i], i);
        }
        return null;
    }
}
