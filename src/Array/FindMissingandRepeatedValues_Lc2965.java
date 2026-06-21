package Array;

import java.util.HashMap;
import java.util.Map;

public class FindMissingandRepeatedValues_Lc2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=grid.length;
        int len=n*n;
        int sum=(len*(len+1))/2;
        int num=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==2) {
                ans[0] = key;
            }
        }
        for(Map.Entry<Integer, Integer> key:map.entrySet()){
            num+=key.getKey();
        }

        ans[1]=sum-num;
        return ans;
    }
}
