package Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence_Lc128 {

    ///  Time complexity-->O(N^2) && Space complexity-->O(1)
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len==0)return 0;
        int longest=1;
        for(int i=0; i<len; i++){
            int x=nums[i];
            int count=1;
            while(linearSearch(nums,x+1)==true){
                count++;
                x+=1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    private boolean linearSearch(int[] nums, int x) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                return true;
            }
        }
        return false;
    }

    ///  Time complexity-->O(N+2N=3N) && Space Complexity-->O(N)
//    public int longestConsecutive(int[] nums) {
//        int n=nums.length;
//        if(n==0)return 0;
//        int longest=1;
//        HashSet<Integer> set=new HashSet<>();
//        for(int num:nums){  // Tc-->O(N)
//            set.add(num);
//        }
//        // iterate on Hashset-->
//        for(int ele:set){ // Tc-->O(N)
//            if(!set.contains(ele-1)){
//                int count=1;
//                int x=ele;
//                while(set.contains(x+1)){ // Tc-->O(N+N)
//                    x=x+1;
//                    count++;
//                }
//                longest=Math.max(longest,count);
//            }
//        }
//        return longest;
//    }

///  Time complexity-->O(nLogn+n);
//    public int longestConsecutive(int[] nums) {
//        int n = nums.length;
//        if(n==0)return 0;
//        Arrays.sort(nums);
//        int len=1;
//        int count=0;
//        int lastSmall=Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            if(nums[i]-1==lastSmall){
//                count=count+1;
//                lastSmall=nums[i];
//            }else if(nums[i] != lastSmall){
//                count=1;
//                lastSmall=nums[i];
//            }
//            len=Math.max(len,count);
//        }
//        return len;
//    }
}
