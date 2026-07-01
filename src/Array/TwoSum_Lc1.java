package Array;

import java.util.HashMap;

public class TwoSum_Lc1 {
    ///  Time Complexity-->O(n) and Space complexity-->O(n);
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         int n=nums.length;
         for(int i=0; i<n; i++){
             int compliment=target-nums[i];
             if(map.containsKey(compliment)){
                 return new int[]{map.get(compliment),i};
             }
             map.put(nums[i],i);
         }
         return new int[]{-1,-1};
    }
    ///  Time complexity-->O(n^2);
//    public int[] twoSum(int[] nums, int target) {
//        int n=nums.length;
//        int arr[]=new int[2];
//        for(int i=0; i<n; i++){
//            int a=target-nums[i];
//            for(int j=i+1; j<n; j++){
//                if(a==nums[j]){
//                    arr[0]=i;
//                    arr[1]=j;
//                    break;
//                }
//            }
//        }
//        return arr;
//    }
}
