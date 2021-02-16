package arrays;

public class ProuctOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int temp = 1;
        int [] result = new int[n];

        // Allocation of resultant array
        //product of elements on the left side of nums[i] exclding nums[i]
        for(int i = 0; i < n; i++)
        {
            result[i] = temp;
            temp = nums[i]*temp;
        }
        // initializing temp to 1 for the product ont he right side of nums[i]
        temp = 1;
        //product of elements on the right side of nums[i] exclding nums[i]
        for( int i = n-1; i>=0; i--)
        {
            result[i] = result[i]* temp;
            temp = temp*nums[i];
        }
        return result;
    }
}
