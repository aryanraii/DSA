package Array;

import java.util.HashMap;

public class ContiguousArray_Lc525 {
    /// Time complexity-->O(n) && Space complexity-->O(n);
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen=0;
        int n=nums.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+(nums[i]==0?-1:1); //0--> -1 && 1--> 1 so that sum==0
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxLen=Math.max(maxLen,len);
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
