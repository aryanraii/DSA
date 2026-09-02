package Array;

import java.util.HashMap;

public class SubarraySumEqualsK_Lc560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();//map(sum, index)
        int n = nums.length;
        int sum=0;
        int count=0;
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            int remaining=sum-k;
            if(map.containsKey(remaining)){
                count+=map.get(remaining);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }


//    public int subarraySum(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();//map(sum, index)
//        int n = nums.length;
//        int sum=0;
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            sum+=nums[i];
//            if(sum==k){
//                count++;
//            }
//            int remaining=sum-k;
//
//            if(map.containsKey(remaining)){
//                count++;
//            }
//            if(!map.containsKey(sum)){
//                map.put(sum,i);
//            }
//        }
//        return count;
//    }
}
