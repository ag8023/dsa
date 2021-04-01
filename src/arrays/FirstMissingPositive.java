package arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0, temp;
        while(i < nums.length)
        {
            int j = nums[i];
            if(nums[i]<nums.length && nums[i] >0 && nums[i] != nums[j-1])
            {
                temp = nums[i];
                nums[i]= nums[j-1];
                nums[temp-1] = temp;
            }
            else
                i++;
        }
        for(int n = 0; n<nums.length; n++)
        {
            if(nums[n] != n+1)
                return n+1;
        }
        return nums.length + 1;
    }
}
