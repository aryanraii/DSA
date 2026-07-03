package BinarySearch;

public class SearchinRotatedSortedArrayII_Lc81 {
    //Time complexity-->O(logn)
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;

            //handle duplicates
            if(nums[low]==nums[mid] && nums[high]==nums[mid]){
                low=low+1;
                high=high-1;
            }
            //the left is sorted
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    if(nums[low]<=target) high=mid-1;
                    else {
                        low++;
                        high=mid-1;
                    }

                }
                else{

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
        return false;
    }
}
