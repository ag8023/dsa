package Day23;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        int index = 0;
        String key;
        for(String s:strs)
        {
            Arrays.fill(count, 0);
            for(char c: s.toCharArray())
            {
                index = c - 'a';
                count[index]++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<26; i++)
            {
                sb.append("#");
                sb.append(count[i]);
            }
            key = sb.toString();
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
