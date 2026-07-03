package BinarySearch;

public class FindKthRotation_GFG {
    //Time complexity-->O(logn)
    public int findKRotation(int arr[]) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid] && arr[mid]<arr[high]){
                high=mid-1;
            }else{
                low++;
            }
        }
        return low;
    }
}
