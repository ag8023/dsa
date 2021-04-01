package Math;

public class LCM {
    public int findLCM(int x, int y)
    {
         int lcm = 1;
         int greater = (x>y)? x: y;
         for(int i = greater; i < x*y; i++)
         {
             if(x%i == 0 && y%i == 0)
             {
                 lcm = i;
                 break;
             }
         }
        return lcm;
    }
}
