package arrays;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int i = 0;
        while(i<nums.length-1)
        {
            if(nums[i] <= nums[i+1])
                i++;
            else
                return i;
        }
        return i;

    }

}
