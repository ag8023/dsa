package arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;
        int index = 0;
        for(int num:nums)
        {
            if(num!=val)
            {
                nums[index++] = num;
            }
        }
        return index;
    }
}
