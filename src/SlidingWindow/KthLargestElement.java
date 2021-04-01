package SlidingWindow;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++) // add only k numbers into the queue
        {
            pq.add(nums[i]);
        }
        for(int j = k ; j<nums.length; j++) // remainder of the array iteration
        {
            if( nums[j] > pq.peek()) // compare with the first element of the queue(smallest of the k elements added to the queue)
            {
                pq.remove();
                pq.add(nums[j]);   //queue readjusts after adding the larger number
            }
        }
        return pq.peek();
    }
}
