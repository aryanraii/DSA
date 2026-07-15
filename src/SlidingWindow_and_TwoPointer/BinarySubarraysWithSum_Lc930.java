package SlidingWindow_and_TwoPointer;

public class BinarySubarraysWithSum_Lc930 {
    //Time complexity-->O(2n);
    public int numSubarraysWithSum(int[] nums, int goal) {
         return atMost(nums,goal)-atMost(nums,goal-1);
    }

    private int atMost(int[] nums, int goal) {
        if(goal<0) return 0;
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while(right<n){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(right - left+1);
            right++;
        }
        return count;
    }
    //Time complexity-->O(n^2) space complexity-->O(1)
//    public int numSubarraysWithSum(int[] nums, int goal) {
//        int n = nums.length;
//        int left = 0;
//        int right = 0;
//        int result=0;
//        int sum=0;
//        while(right<n){
//            sum+=nums[right];
//            if(sum==goal){
//                result++;
//            }
//            while(sum>goal||sum==goal){
//                sum-=nums[left++];
//                left++;
//                if(sum==goal){
//                    result++;
//                }
//            }
//            right++;
//        }
//        return result;
//    }
}
