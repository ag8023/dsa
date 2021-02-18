package hashtables;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int missingNumber(int[] nums) {

        Set<Integer> mySet = new HashSet<>();
        for(int num:nums)
        {
            mySet.add(num);
        }
        for(int i = 0; i <= nums.length; i++)
        {
            if(mySet.contains(i) == false)
                return i;
        }

        return -1;
    }
}
