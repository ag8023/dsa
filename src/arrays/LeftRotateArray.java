package src.arrays;

public class LeftRotateArray {
    public void rotate(int[] nums, int k) {
        int temp = 0, i;
        int n = nums.length - 1;
        while(k>0)
        {
            temp = nums[0];
            for(i = 0; i<n; i++)
            {
                nums[i] = nums[i+1];
            }
            nums[n] = temp;
            k--;
        }

    }

}
