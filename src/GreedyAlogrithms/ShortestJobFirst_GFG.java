package GreedyAlogrithms;

import java.util.Arrays;

public class ShortestJobFirst_GFG {4
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int waitingTime=0;
        int time=0;
        int n=bt.length;
        for(int i=0; i<n; i++){
            waitingTime+=time;
            time+=bt[i];
        }
        return waitingTime/n;
    }
}
