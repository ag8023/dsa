package arrays;

import java.util.Arrays;

public class RailwayPlatforms {
    static int findPlatform(int arr[], int dep[], int n)
    {
        //Sort Arrival and Departure arrays
        Arrays.sort(arr);
        Arrays.sort(dep);

        //plat_needed indicates number of platforms needed at a time
        int plat_needed = 1, result = 1;
        int i=1, j=0;
         while(i <n && j < n)
         {
             // merge sort, compare each element in each array and choose
             // if element is arrival then increase platforms needed
             if(arr[i] <= dep[j])
             {
                 plat_needed++;
                 i++;
             }
             // else trains are departing so reduce the number of platforms
             else if(arr[i] > dep[j])
             {
                 plat_needed--;
                 j++;
             }
             //compare platforms needed and update result
             if(plat_needed > result)
                 result = plat_needed;
         }
         return result;
    }
}
