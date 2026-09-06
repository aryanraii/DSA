package Array;

public class MaximumAbsoluteSumOfAnySubarray_Lc1749 {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=nums[0];
        int minSum=nums[0];

        int currNeg=nums[0];
        int currPos=nums[0];
        for(int i=1; i<nums.length; i++){
            currPos=Math.max(nums[i],currPos+nums[i]);
            maxSum=Math.max(maxSum,currPos);

            currNeg=Math.min(nums[i],currNeg+nums[i]);
            minSum=Math.min(minSum,currNeg);
        }

        return Math.max(maxSum,Math.abs(minSum));
    }
}
