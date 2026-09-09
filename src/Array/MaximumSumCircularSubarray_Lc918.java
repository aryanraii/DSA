package Array;

public class MaximumSumCircularSubarray_Lc918 {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        //totalSum-->
        int totalSum=0;
        for(int i=0; i<n; i++){
            totalSum+=nums[i];
        }
        int maxSum=nums[0];
        int minSum=nums[0];
        int sum1=nums[0];
        int sum2=nums[0];
        for(int i=1; i<n; i++){
            //maxSum-->
            sum1=Math.max(sum1+nums[i],nums[i]);
            maxSum=Math.max(maxSum,sum1);
            //minSum-->
            sum2=Math.min(sum2+nums[i],nums[i]);
            minSum=Math.min(minSum,sum2);
        }
        //currSum-->totalSum-minSum
        int currSum=totalSum-minSum;
        if(maxSum>0)return Math.max(maxSum,currSum);
        return maxSum;
    }

    // public int maxSubarraySumCircular(int[] nums) {
    //     int n=nums.length;
    //     int result=Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         rotate(nums);
    //         int sum=subarraySum(nums);
    //         result=Math.max(result,sum);
    //     }
    //     return result;
    // }
    // public int subarraySum(int[]nums){
    //     int sum=0;
    //     int result=Integer.MIN_VALUE;
    //     for(int i=0; i<nums.length; i++){
    //         sum+=nums[i];
    //         result=Math.max(sum,result);
    //         if(sum<0){
    //             sum=0;
    //         }
    //     }
    //     return result;
    // }
    // public static void rotate(int[]nums){
    //     int n=nums.length;
    //     int i=0;
    //     int j=n-1;
    //     while(i<j){
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         i++;
    //         j--;
    //     }

    //     i=1;
    //     j=n-1;
    //     while(i<j){
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
}
