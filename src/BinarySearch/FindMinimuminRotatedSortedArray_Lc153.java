package BinarySearch;

public class FindMinimuminRotatedSortedArray_Lc153 {
    //Time complexity-->O(logn)
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid] && nums[mid]<nums[high]){
                high=mid-1;
            }else{
                low--;
            }
        }
        return nums[low];
    }
}
