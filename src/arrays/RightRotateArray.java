package arrays;

public class RightRotateArray {
    public void rotate(int[] nums, int k) {
        int temp = 0, i;
        int n = nums.length - 1;
        while(k>0)
        {
            temp = nums[n];
            for(i = n; i >0; i--)
            {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }

    }

}
