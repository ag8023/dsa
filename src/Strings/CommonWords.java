package Strings;

import java.util.*;

public class CommonWords {
    public String mostCommonWord(String paragraph, String[] banned) {
        String p = "";
        for(char c: paragraph.toCharArray())
        {
            if(Character.isLetter(c) || Character.isWhitespace(c))
                p+=c;
            else
            {
                String sp = " ";
                p+=sp;
            }
        }
        String n = p.toLowerCase();
        String [] str = n.split("\\s+");
        Set<String> bWords = new HashSet<>();
        for(String s : banned)
            bWords.add(s);
        Map<String, Integer> hmap = new HashMap<>();
        for(String s: str)
        {
            if(!bWords.contains(s.toLowerCase()))
            {
                hmap.put(s, hmap.getOrDefault(s, 0)+1);
            }
        }
        String max = Collections.max(hmap.entrySet(), Map.Entry.comparingByValue()).getKey();
        return max;
    }

    public boolean isPunctuation(char c)
    {
        boolean b = false;
        switch(c)
        {
            case '!':
            case '?':
            case '\'':
            case ',':
            case ';':
            case '.':
                b = true;
                break;
        }

        return b;
    }
}
