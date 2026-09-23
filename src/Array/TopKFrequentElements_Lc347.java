package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements_Lc347 {
    class pair{
        int num;
        int freq;
        pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<pair> q=new PriorityQueue<>((a, b)->b.freq-a.freq);
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            q.add(new pair(num,freq));
        }
        int ans[]=new int[k];
        for(int i=0; i<k; i++){
            pair x=q.poll();
            ans[i]=x.num;
        }
        return ans;
    }
}
