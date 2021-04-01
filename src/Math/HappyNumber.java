package Math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> mySet = new HashSet<>();
        int sum = 0, temp, curr;
        while(n != 1)
        {
            curr = n;
            sum = 0;
            while(curr != 0)
            {
                temp = curr%10;
                sum+= temp*temp;
                curr/=10;
            }
            if(!mySet.contains(sum))
            {
                mySet.add(sum);
                n = sum;
            }
            else
                return false;
        }
        return true;
    }
}
