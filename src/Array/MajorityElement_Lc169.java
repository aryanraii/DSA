package Array;

import java.util.HashMap;

public class MajorityElement_Lc169 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }else{
                map.put(ele,1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}
