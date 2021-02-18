package arrays;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c  = s.charAt(i);
            if(hmap.containsKey(c))
            {
                int val = hmap.get(c);
                val++;
                hmap.put(c, val);
            }
            else
            {
                hmap.put(c, 1);
            }
        }
        for(int i = 0; i < s.length(); i++)
        {
            if(hmap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
