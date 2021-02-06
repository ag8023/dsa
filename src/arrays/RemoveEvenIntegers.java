package src.arrays;

import java.util.ArrayList;

public class RemoveEvenIntegers {
    public ArrayList<Integer> removeEvenFromArray(ArrayList<Integer> nums) {

        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i)%2 == 0)
            {
                nums.remove(i);
            }
        }
        return nums;
    }
}
