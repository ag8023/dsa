package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSSWithKDistinct {
    public int findLongestLength(String s, int k)
    {
        Map<Character, Integer> hmap = new HashMap<>();
        int start = 0, maxLength = 0;
        char lch, rch;
        for(int end = 0; end < s.length(); end++)
        {
            lch = s.charAt(end);
            hmap.put(lch, hmap.getOrDefault(lch, 0) + 1);
            while(hmap.size()> k)
            {
               rch = s.charAt(start);
               hmap.put(rch, hmap.get(rch) - 1);
               if(hmap.get(rch) == 0)
               {
                   hmap.remove(rch);
               }
               start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
       return maxLength;
    }

}
