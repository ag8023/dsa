package recursion;

public class DecreasingNumbers {
    public void decreasing(int n) {
        if(n == 0) {
            //System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
}
