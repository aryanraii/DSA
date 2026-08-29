package Array;

import java.util.Arrays;

public class NonOverlappingIntervals_Lc435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int count=0;
        int i=0;
        int j=1;
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        while(j<n){
            int currStart=intervals[i][0];
            int currEnd=intervals[i][1];

            int nextStart=intervals[j][0];
            int nextEnd=intervals[j][1];
            //no overlapping
            if(currEnd<=nextStart){
                i=j;
                j++;
            }
            //overlapping
            else if(currEnd<=nextEnd){
                j++;
                count++;
            }
            else if(currEnd>nextEnd){
                i=j;
                j++;
                count++;
            }
        }
        return count;
    }
}
