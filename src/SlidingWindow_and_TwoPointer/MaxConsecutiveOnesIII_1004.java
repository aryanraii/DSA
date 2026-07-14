package SlidingWindow_and_TwoPointer;

public class MaxConsecutiveOnesIII_1004 {
    //Time complexity-->O(n) space complexity-->O(1)
    public int longestOnes(int[] nums, int k) {
        //approach-->find longest subarray with at most k zeros
        int maxLen=0;
        int left=0;
        int right=0;
        int len=nums.length;
        int zeros=0;
        while(right<len){
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                int length=right-left+1;
                maxLen=Math.max(length,maxLen);
            }
            right++;
        }
        return maxLen;
    }


    //Time complexity-->O(2n) space complexity-->O(1)
//    public int longestOnes(int[] nums, int k) {
//        //approach-->find longest subarray with at most k zeros
//         int maxLen=0;
//         int left=0;
//         int right=0;
//         int len=nums.length;
//         int zeros=0;
//         while(right<len){//O(n)
//             if(nums[right]==0){
//                 zeros++;
//             }
//             while(zeros>k){//in worst case O(n)
//                 if(nums[left]==0){
//                     zeros--;
//                 }
//                 left++;
//             }
//             if(zeros<=k){
//                 int length=right-left+1;
//                 if(length>maxLen){
//                     maxLen=length;
//                 }
//             }
//             right++;
//         }
//         return maxLen;
//    }


    //Time complexity-->O(n^2) space complexity-->O(1)
//    public int longestOnes(int[] nums, int k) {
//        //approach-->find longest subarray with at most k zeros
//        int n=nums.length;
//        int maxLen=0;
//        for(int i=0;i<n;i++){
//            int zeros=0;
//            for(int j=i;j<n;j++){
//                if(nums[j]==0){
//                    zeros++;
//                }
//                if(zeros<=k){
//                    int length=j-i+1;
//                    maxLen=Math.max(length,maxLen);
//                }else{
//                    break;
//                }
//            }
//        }
//        return maxLen;
//    }
}
