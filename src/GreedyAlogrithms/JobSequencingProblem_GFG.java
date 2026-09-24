package GreedyAlogrithms;

import java.util.ArrayList;

public class JobSequencingProblem_GFG {
    class Pair{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n=profit.length;
        Pair[]sortProfit=new Pair[n];
        int maxDeadline=0;
        for(int i=0; i<n; i++){
            sortProfit[i]=new Pair(profit[i],i);
            maxDeadline=Math.max(maxDeadline,deadline[i]);
        }
        Arrays.sort(sortProfit,(a,b)->b.val-a.val);
        Boolean visited[]=new Boolean[maxDeadline+1];
        Arrays.fill(visited,false);
        int ans=0;
        int count=0;
        for(int i=0; i<n; i++){
            Pair current=sortProfit[i];
            int val=current.val;
            int idx=current.idx;

            int dead=deadline[idx];
            for(int slot=dead; slot>=1; slot--){
                if(!visited[slot]){
                    ans+=val;
                    count++;
                    visited[slot]=true;
                    break;
                }
            }

        }
        ArrayList<Integer>list=new ArrayList<>();
        list.add(count);
        list.add(ans);
        return list;
    }
}
