package Math;

public class GCD {
    public int findGCD(int x, int y)
    {
        int gcd = 1;
        for(int i = 2; i <= x && i <= y; i++)
        {
            if(x%i == 0 && y%i == 0)
            {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
