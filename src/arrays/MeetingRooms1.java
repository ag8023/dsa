package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms1 {
    public static int minMeetingRooms(int[][] meetingTimes)
    {
        if(meetingTimes.length == 0)
            return 0;
        //sort meetings by their start time
        Arrays.sort(meetingTimes, (a,b)->Integer.compare(a[0], b[0]));
        PriorityQueue<Integer>minHeap = new PriorityQueue<>((A,B)->A-B);
        //Allocate first Meeting to a room and add entry
        minHeap.add(meetingTimes[0][1]); // end time of the first meeting
        //Traverse the remaining rooms and keep checking if the meeting at the top of the heap has ended, to check for a free room
        for(int i = 1; i < meetingTimes.length; i++)
        {
            int currStart = meetingTimes[i][0];
            int currEnd = meetingTimes[i][1];
            int earliestEnding = minHeap.peek();
            if(earliestEnding <= currStart)
                minHeap.remove();
            //if the room is free, thenw e remove it fromt he heap and add the ending time of the current meeting to be inserted
            minHeap.add(currEnd);
        }
        return minHeap.size();
    }
}
