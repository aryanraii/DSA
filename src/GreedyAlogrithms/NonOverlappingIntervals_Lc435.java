package GreedyAlogrithms;

import java.util.Arrays;

public class NonOverlappingIntervals_Lc435 {
    //similar to n meetings in room-->
    class Pair{
        int st;
        int ed;
        Pair(int st, int ed){
            this.st=st;
            this.ed=ed;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Pair[]arr=new Pair[n];
        for(int i=0; i<n; i++){
            arr[i]=new Pair(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(arr,(a, b)->a.ed-b.ed);
        int count=1;
        int freeTime=arr[0].ed;
        for(int i=1; i<n; i++){
            if(arr[i].st>=freeTime){
                count++;
                freeTime=arr[i].ed;
            }
        }
        return n-count;

    }


    // public int eraseOverlapIntervals(int[][] intervals) {
    //     int n=intervals.length;
    //     int count=0;
    //     int i=0;
    //     int j=1;
    //     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    //     while(j<n){
    //         int currStart=intervals[i][0];
    //         int currEnd=intervals[i][1];

    //         int nextStart=intervals[j][0];
    //         int nextEnd=intervals[j][1];
    //         //no overlapping
    //         if(currEnd<=nextStart){
    //             i=j;
    //             j++;
    //         }
    //         //overlapping
    //         else if(currEnd<=nextEnd){
    //             j++;
    //             count++;
    //         }
    //         else if(currEnd>nextEnd){
    //             i=j;
    //             j++;
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}
