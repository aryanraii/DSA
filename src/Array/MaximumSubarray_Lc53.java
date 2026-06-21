package Array;

public class MaximumSubarray_Lc53 {
    /// Kadane's Algorithm--> TC=O(n);
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
/* if all values of an array are negative then maxSum also negative
thats why we wrote reset condition(sum=0) in the end of the loop
 */
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
