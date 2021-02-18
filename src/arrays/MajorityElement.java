package arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int num:nums)
        {
            if(count == 0)
                candidate = num; // older candidate value is 0 as it got cancelled out
            count+=(num==candidate)?1:-1;
        }
        return candidate;
    }
}
