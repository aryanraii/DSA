package BinarySearch;

public class FindPeakElement_Lc162 {
    //Time complexity-->O(n);
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0; // true because nums[-1] will be minus infinity
        if(nums[n-1]>nums[n-2]) return n-1; // true because nums[n] will be minus infinity
        int low=1;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            // mid lies on increasing slope
            else if(nums[mid]>nums[mid-1]){ // increasing slope
                low=mid+1;
            }
            //mid lies on Decreasing slope
            else if(nums[mid]>nums[mid+1]){
                high=mid-1;
            }
            // if mid lies on reversal peak then you can low=mid+1 or high=mid-1;
            else{
                low=mid+1;
            }
        }
        return -1;
    }

//    public int findPeakElement(int[] nums) {
//         //Time complexity-->O(n)
//        int n=nums.length;
//        for(int i=0;i<n;i++){
//            if((i==0||nums[i]>nums[i-1])&&(i==n-1||nums[i]>nums[i+1])){
//                return i;
//            }
//        }
//        return -1;
//    }
}
