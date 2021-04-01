package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSSNonRepeating {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        int windowStart, windowEnd, maxLength = 0, wLength = 0;
        char ch;
        for(windowStart = 0,windowEnd = 0; windowEnd < s.length(); windowEnd++)
        {
            ch = s.charAt(windowEnd);
            //check for existence in map, if present update windowStart else insert new and its index
            if(hmap.containsKey(ch))
            {
                windowStart = Math.max(hmap.get(ch)+1, windowStart); // move the start pointer ahead
            }
            wLength = windowEnd-windowStart + 1;
            maxLength = Math.max(maxLength, wLength);
            hmap.put(ch, windowEnd);
        }
        return maxLength;
    }

}
