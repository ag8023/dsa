package arrays;

public class RemoveDupes {
    public int removeDuplicates(int[] nums) {
        if(nums.length <2)
            return nums.length;
        int index = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[index++] = nums[i]; // if adjacent numbers are not same, then the value at index is overwritten with the value at i and index and i are both incremented, else only i is incremented if adjacent numbers are duplicates
            }
        }
        return index;
    }
}
