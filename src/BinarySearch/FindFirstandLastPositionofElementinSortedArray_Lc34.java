package BinarySearch;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray_Lc34 {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int first=firstOccur(nums,target);
        if(first==-1)return ans;
        int last=lastOccur(nums,target);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }

    private int lastOccur(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return last;
    }

    private int firstOccur(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }

    //Time complexity-->O(2logn) space complexity-->O(1)
//    public int[] searchRange(int[] nums, int target) {
//        int n=nums.length;
//        int ans[]={-1,-1};
//        int lowerBound=lowerBound(nums,target);
//        if(lowerBound==n || nums[lowerBound]!=target){
//            return ans;
//        }
//        int upperBound=upperBound(nums,target);
//        ans[0]=lowerBound;
//        ans[1]=upperBound-1;
//        return ans;
//    }
//
//    private int upperBound(int[] nums, int target) {
//        int n=nums.length;
//        int low=0;
//        int high=n-1;
//        int ans=n;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(nums[mid]>target){
//                ans=mid;
//                //look for more small index on left
//                high=mid-1;
//            }else{
//                low=mid+1;//look for right
//            }
//        }
//        return ans;
//    }
//
//    private int lowerBound(int[] nums, int target) {
//        int n=nums.length;
//        int low=0;
//        int high=n-1;
//        int ans=n;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(nums[mid]>=target){
//                ans=mid;
//                high=mid-1;// look for more small index in left
//            }else{
//                low=mid+1;// look for right
//            }
//        }
//        return ans;
//    }


//    public int[] searchRange(int[] nums, int target) {
//        int n = nums.length;
//        int low=0,high=n-1;
//        int [] ans=new int [2];
//        Arrays.fill(ans,-1);
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(nums[mid]==target) {
//                ans[0] = mid;
//                ans[1] = mid;
//                int x=mid+1;
//                int y=mid-1;
//                while(x<n && nums[x]==target) {
//                    ans[1]++;
//                    x=x+1;
//                }
//                while(y>=0 && nums[y]==target) {
//                    ans[0]--;
//                    y=y-1;
//                }
//                return ans;
//            }
//            else if(nums[mid]<target) {
//                low=mid+1;
//            }else{
//                high=mid-1;
//            }
//        }
//        return ans;
//    }
}
