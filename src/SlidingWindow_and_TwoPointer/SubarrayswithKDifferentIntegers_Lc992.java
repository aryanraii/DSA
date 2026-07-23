package SlidingWindow_and_TwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class SubarrayswithKDifferentIntegers_Lc992 {
    //Time complexity-->O(n) && space complexity-->O(n)
    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubarray(nums,k)-findSubarray(nums,k-1);
    }

    private int findSubarray(int[] nums, int k) {
        int left=0;
        int right=0;
        int len=nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<len){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
    //Time complexity-->O(n^2) & space complexity--O(n)
//    public int subarraysWithKDistinct(int[] nums, int k) {
//        int count=0;
//        int len=nums.length;
//        for(int index=0;index<len;index++){
//            HashSet<Integer> set=new HashSet<>();
//            for(int j=index;j<len;j++){
//                 set.add(nums[j]);
//                 if(set.size()==k){
//                     count++;
//                 }else if(set.size()>k){
//                     break;
//                 }
//            }
//        }
//        return count;
//    }
}
