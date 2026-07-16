package SlidingWindow_and_TwoPointer;

public class CountNumberofNiceSubarrays_Lc1248 {
    //Time complexity-->O(2n)
    public int numberOfSubarrays(int[] nums, int k) {
        return findNiceNum(nums,k)-findNiceNum(nums,k-1);
    }

    private int findNiceNum(int[] nums, int k) {
        if(k<0) return 0;
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while(right<n){
            sum+=nums[right]%2;
            while(sum>k){
                sum-=nums[left]%2;
                left++;
            }
            count+=(right - left+1);
            right++;
        }
        return count;
    }
    //Time complexity-->O(n^2)
//    public int numberOfSubarrays(int[] nums, int k) {
//        int n = nums.length;
//        int ans = 0;
//        for(int i = 0; i < n; i++){
//            int count=0;
//            for(int j = i; j < n; j++){
//                if(nums[j] % 2 !=0){
//                    count++;
//                }
//                if(count == k){
//                    ans++;
//                }
//                if(count>k) break;
//            }
//        }
//        return ans;
//    }
}
