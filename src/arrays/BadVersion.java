package arrays;

public class BadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left <= right)
        {
            int mid = left + (right-left)/2;
            if(isBadVersion(mid))
            {
                right = mid - 1; // mid is a bad version so there could be more bad versions prior to it so we move the right ptr to the left
            }
            else
            {
                left = mid + 1; // all versions uptil mid are good so we need to look further to the right so we move the left ptr
            }
        }
        return left;
    }
}
