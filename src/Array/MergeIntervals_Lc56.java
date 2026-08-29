package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_Lc56 {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int nextStart=intervals[i][0];
            int nextEnd=intervals[i][1];

            if(end>=nextStart){
                end=Math.max(end,nextEnd);
            }
            else{
                result.add(new int[]{start,end});
                start=nextStart;
                end=nextEnd;
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}
