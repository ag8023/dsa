package recursion;

public class IncreasingNumbers {
    public void increasing(int n) {
        if(n == 0) {
            //System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n);

    }
}
