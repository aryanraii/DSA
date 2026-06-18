package Array;

import java.util.HashMap;

public class MajorityElement_Lc169 {

    ////    Time complexity--> O(n) and space complexity--> O(1)
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int freq=0; int ans=0;
        for(int i=0; i<n; i++){
            if(freq==0)ans=nums[i];
            if(ans==nums[i]) freq++;
            else freq--;
        }
        return ans;
    }
////    Time complexity--> O(n) and space complexity--> O(n)
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int ele:nums){
//            if(map.containsKey(ele)){
//                int freq=map.get(ele);
//                map.put(ele,freq+1);
//            }else{
//                map.put(ele,1);
//            }
//        }
//        for(int key:map.keySet()){
//            if(map.get(key)>n/2){
//                return key;
//            }
//        }
//        return 0;
//    }
}
