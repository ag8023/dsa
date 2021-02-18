package arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int len  = nums.length;
        int[] res = new int[len];
        int x = 0, i = 0, j = n;
        while(x < len )
        {
            if(x%2 == 0)
            {
                res[x] = nums[i];
                i++;
            }
            else
            {
                res[x] = nums[j];
                j++;
            }
            x++;
        }
        return res;
    }
}
