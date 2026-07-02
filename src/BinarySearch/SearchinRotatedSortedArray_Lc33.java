package BinarySearch;

public class SearchinRotatedSortedArray_Lc33 {
    //Time complexity-->O(N)
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;

            //the left is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }

            // right half is sorted
            else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
