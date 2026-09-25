package GreedyAlogrithms;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval_Lc57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int i=0;
        List<List<Integer>>ans=new ArrayList<>();
        //non overlapping intervals-->
        while(i<n&&intervals[i][1]<newInterval[0]){
            List<Integer> list=new ArrayList<>();
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            ans.add(list);
            i=i+1;
        }
        //overlapping intervals-->
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i=i+1;
        }
        List<Integer>list2=new ArrayList<>();
        list2.add(newInterval[0]);
        list2.add(newInterval[1]);
        ans.add(list2);
        //remaining intervals-->
        while(i<n){
            List<Integer>list3=new ArrayList<>();
            list3.add(intervals[i][0]);
            list3.add(intervals[i][1]);
            ans.add(list3);
            i=i+1;
        }

        int [][]result=new int[ans.size()][2];
        for(int j=0; j<ans.size(); j++){
            result[j][0]=ans.get(j).get(0);
            result[j][1]=ans.get(j).get(1);
        }
        return result;
    }
}
