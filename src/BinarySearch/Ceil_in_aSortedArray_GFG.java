package BinarySearch;

public class Ceil_in_aSortedArray_GFG {
    public int findCeil(int[] arr, int x) {
        // Time complexity-->O(logn)
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=x){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
