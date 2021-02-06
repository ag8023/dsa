package src.hashtables;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numberOfJewels(String j, String s)
    {
        Set<Character>jSet = new HashSet<>();
        for(char c : j.toCharArray())
        {
            jSet.add(c);
        }
        int numJewels = 0;
        for(char x: s.toCharArray())
        {
            if(jSet.contains(x))
            {
                numJewels++;
            }
        }
        return numJewels;
    }
}
