package SlidingWindow;

import java.util.HashMap;

public class MinWindowSubString {
    public String minWindow(String s, String t) {
        if(s== null || s.length() == 0 || t == null || t.length() == 0)
            return null;
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(char c: t.toCharArray())
        {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1); // created frequency map of the pattern
        }
        int wEnd = 0, wStart = 0, minLen = Integer.MAX_VALUE, sStrStart=0, matched = 0, minSubstrStart = 0;
        char currChar, leftChar;

        for(wEnd = 0; wEnd < s.length(); wEnd++)
        {
            currChar = s.charAt(wEnd);
            if(tmap.containsKey(currChar))
            {
                tmap.put(currChar, tmap.get(currChar)-1); // part of pattern

                if(tmap.get(currChar) >=0)
                {
                    matched++; // character has been matched
                }
            }

            while(matched == t.length())
            {
                // get the current substring length
                if(wEnd - wStart + 1 < minLen)
                {
                    minLen = wEnd-wStart+1;
                    minSubstrStart = wStart;
                }

                leftChar = s.charAt(wStart++); // iterate over current substring that contains all the matched characters
                if(tmap.containsKey(leftChar))
                {
                    if(tmap.get(leftChar) == 0)
                    {
                        matched--;
                    }
                    tmap.put(leftChar, tmap.getOrDefault(leftChar, 0) + 1);
                }

            }
        }
        return (minLen > s.length()) ? "" : s.substring(minSubstrStart, minSubstrStart + minLen);

    }
}
