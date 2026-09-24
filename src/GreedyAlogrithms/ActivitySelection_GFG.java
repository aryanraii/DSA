package GreedyAlogrithms;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelection_GFG {
    class Triplet{
        int start;
        int end;
        int position;
        Triplet(int start, int end,int position){
            this.start=start;
            this.end=end;
            this.position=position;
        }
    }
    public int activitySelection(int[] start, int[] finish) {
        int n=start.length;
        Triplet[]arr=new Triplet[n];
        for(int i=0;  i<n; i++){
            arr[i]=new Triplet(start[i],finish[i],i+1);
        }

        Arrays.sort(arr,(a, b)->a.end-b.end);
        int count=1;
        int freeTime=arr[0].end;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0].position);
        for(int i=1; i<n; i++){
            if(arr[i].start>freeTime){
                count++;
                freeTime=arr[i].end;
                ans.add(arr[i].position);
            }
        }
        return count;
    }
}
