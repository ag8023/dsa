package arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int mid;
        int low = 0; // lower bound index
        int high = nums.length-1; // higher bound index
        while(low<=high) // do not forget <= and not just  <
        {
            mid = low + (high-low)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] < target)
            {
                low = mid + 1;

            }
            else
            {
                high = mid - 1;
            }
        }
        return -1; // element not present in array
    }
}
