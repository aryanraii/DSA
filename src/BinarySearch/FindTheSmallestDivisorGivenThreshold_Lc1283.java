package BinarySearch;

public class FindTheSmallestDivisorGivenThreshold_Lc1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int ele:nums){
            high=Math.max(high,ele);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(isValid(nums,mid,threshold)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean isValid(int[]nums,int mid,int threshold){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            int cal=nums[i]/mid;
            sum+=(nums[i]%mid!=0?1+cal:cal);
        }
        return sum<=threshold;
    }
}
